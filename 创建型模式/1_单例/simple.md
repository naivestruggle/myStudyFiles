# 1、单例设计模式介绍

- 所谓类的单例设计模式，就是采用一定的方法保证在整个的软件系统中，对某个类只能存在一个对象实例，并且该类只提供一个取得其对象实例的方法（静态）。
- 比如Hibernate的SessionFactory，它充当数据存储源的代理，并负责创建Session对象。SessionFactory并不是轻量级的，一般情况下，一个项目通常只需要一个SessionFactory就够了，这就会使用单例模式。

# 2、单例设计模式八种方式

## 2.1、饿汉式（静态常量）

- 步骤

  - 构造器私有化
  - 类的内部创建对象
  - 向外暴露一个静态的公共方法

- 代码实现

  ```java
  public class SimpleTest {
      //1、构造器私有化
      private SimpleTest(){}
  
      //2、类的内部创建静态对象
      private final static SimpleTest instance = new SimpleTest();
  
      //3、对外暴露一个静态的公共方法
      public static SimpleTest getInstance(){
          return instance;
      }
  }
  ```

- 优缺点说明

  - 优点：这种写法比较简单，就是在类装载的时候完成实例化。避免了线程同步问题
  - 缺点：在类装载的时候就完成实例化，没有达到Lazy Loading的效果。如果从始至终从未使用过这个实例，则会造成内存的浪费
  - 这种防止基于classloader机制避免了多线程的同步问题，不过，instance在类装载时就实例化，在单例设计模式中大多都是调用getInstance方法，但是导致类装载的原因有很多种，因此不能确定有其他的方式（或者其他静态方法）导致类装载，这时候初始化instance就没有达到Lazy Loading的效果。
  - 结论：这种单例模式**可用**，**可能**造成内存浪费。

## 2.2、饿汉式（静态代码块）

- 代码实现

  ```java
  public class SimpleTest {
      //1、构造器私有化
      private SimpleTest(){}
  
      //2、类的内部创建静态对象
      private static SimpleTest instance;
  
      static {
          //静态代码块中创建对象
          instance = new SimpleTest();
      }
  
      //3、对外暴露一个静态的公共方法
      public static SimpleTest getInstance(){
          return instance;
      }
  }
  ```

- 这种方式和第一种方式类似。

## 2.3、懒汉式（线程不安全）

```java
public class SimpleTest {
    //1、构造器私有化
    private SimpleTest(){}

    //2、类的内部创建静态对象
    private static SimpleTest instance;

    //3、对外暴露一个静态的公共方法
    public static SimpleTest getInstance(){
        //使用到该方法时，才创建
        if(null == instance){
            instance = new SimpleTest();
        }
        return instance;
    }
}
```

- 优缺点说明：
  - 起到了Lazy Loading的效果，但是只能在单线程下使用。
  - 如果在多线程下，一个线程进入了if(instance == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。所以在多线程环境下不可以使用这种方式。
  - 结论：在实际开发中，不要使用这种方式。

## 2.4、懒汉式（线程安全，同步方法）

```java
public class SimpleTest {
    //1、构造器私有化
    private SimpleTest(){}

    //2、类的内部创建静态对象
    private static SimpleTest instance;

    //3、对外暴露一个静态的公共方法
    public static synchronized SimpleTest getInstance(){
        //使用到该方法时，才创建
        if(null == instance){
            instance = new SimpleTest();
        }
        return instance;
    }
}
```

- 优缺点说明
  - 解决了线程不安全问题
  - 效率太低了，每个线程在想获得类的实例时候，执行getInstance()方法都要进行同步。而其实这个方法只执行一次实例化代码就够了，后面的想获得该类实例，直接return就行了。方法进行同步效率太低。
  - 结论：在时间开发中，不推荐使用这种方式。

## 2.5、懒汉式（线程安全，同步代码块）

```java
public class SimpleTest {
    //1、构造器私有化
    private SimpleTest(){}

    //2、类的内部创建静态对象
    private static SimpleTest instance;

    //3、对外暴露一个静态的公共方法
    public static SimpleTest getInstance(){
        //使用到该方法时，才创建
        if(null == instance){
        	synchronized (SimpleTest.class){
                instance = new SimpleTest();
            }
        }
        return instance;
    }
}
```

- 优缺点说明
  - 这种方式，本意是想对第四种实现方式的改进，因为前面同步方法效率太低，改为同步产生实例化的代码块
  - **但是这种同步并不能起到线程同步的作用**。跟第3中实现方式遇到的情形一致，加入一个线程进入了if(instance == null)判断语句块，还未来得及往下执行，另一个线程也通过了这个判断语句，这时便会产生多个实例。
  - 结论：在实际开发中，不能使用这种方式。

## 2.6、双重检查

```java
public class SimpleTest {
    //1、构造器私有化
    private SimpleTest(){}

    //2、类的内部创建静态对象
    private static SimpleTest instance;

    //3、对外暴露一个静态的公共方法
    public static SimpleTest getInstance(){
        //使用到该方法时，才创建
        if(null == instance){
            synchronized (SimpleTest.class){
                if(null == instance){
                    instance = new SimpleTest();
                }
            }
        }
        return instance;
    }
}
```

- 优缺点说明
  - Double-Check概念是多线程开发中常使用到的，如代码中所示，我们进行了两次if(instance == null)检查，这样就可以保证线程安全了。
  - 这样，实例化代码只用执行一次，后面再次访问时，判断if(instance == null),直接return实例化对象，也避免了反复进行方法同步。
  - 线程安全：延迟加载；效率较高。
  - 结论：在实际开发中，推荐使用这种单例设计模式。

## 2.7、静态内部类

```java
public class SimpleTest {
    private SimpleTest(){}
    //静态内部类（当SimpleTest被类装载的时候  静态内部类不会被装载）
    //等第一次访问的时候才会被装载
    private static class Simple{
        public static final SimpleTest INSTANCE = new SimpleTest();
    }
    public static SimpleTest getInstance(){
        return Simple.INSTANCE;
    }
}
```

- 优缺点说明
  - 这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
  - 静态内部类方式在SimpleTest被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载Simple类，从而完成SimpleTest的实例化。
  - 类的静态属性只会在第一次加载类的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
  - 优点：避免了**线程不安全**，利用静态内部类特点实现延迟加载，效率高
  - 结论：推荐使用

## 2.8、枚举

```java
public class SimpleTest {
    public static void main(String[] args) {
        Simple simple = Simple.INSTANCE;
        Simple simple2 = Simple.INSTANCE;
        System.out.println(simple == simple2);
        System.out.println(simple.equals(simple2));
        System.out.println(simple.hashCode() == simple.hashCode());
        simple.sayOk();
    }
}

//使用枚举  可以实现单例，推荐使用
enum Simple{
    INSTANCE;
    public void sayOk(){
        System.out.println("ok");
    }
}
```

- 优缺点说明
  - 这借助JDK 1.5 中添加的枚举来实现单例模式。不仅能避免读线程同步问题，而且还能防止反序列化重新创建新的对象。
  - 这种方式是Effective java作者Josh Bloch 提倡的方式
  - 结论：推荐使用

# 3、推荐使用

- 静态内部类
- 枚举
- 双重检查
- 饿汉式（在确定这个单例对象在程序中一定会使用的情况下）

# 4、单例模式在JDK应用的源码分析

- 我们JDK中，java.lang.Runtime就是经典的单例模式

- 代码分析 + Debug源码 + 代码说明

  ```java
  //使用饿汉式
  public class Runtime {
      private static Runtime currentRuntime = new Runtime();
      public static Runtime getRuntime() {
          return currentRuntime;
      }
      private Runtime() {}
  }
  ```

# 5、单例模式的注意事项

- 单例模式保证了系统内存中该类只存在一个对象，节省了系统资源，对于一些要频繁创建销毁的对象，使用到哪里模式可以提高系统性能
- 当想实例化一个单例类的时候，必须要记住使用相应的获取对象的方法，而不是使用new。
- 单例模式使用的场景：需要频繁的创建和销毁的对象、创建对象时耗时过多或耗费资源过多（即：重量级对象），但又经常用到的对象、工具类对象、频繁访问数据库或文件的对象（比如数据源、session工厂等）