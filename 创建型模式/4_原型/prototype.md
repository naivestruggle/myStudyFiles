1、提出问题

- 克隆羊问题：现在有一只羊tom，姓名为：tom，年龄为：1，颜色为：白色，请编写程序创建和tom羊属性完全相同的10只羊。

# 2、传统方式解决克隆羊的问题

## 2.1、思路分析

- 分析：创建一个羊的类，new10次

- 类图

  ![1563240993749](images\传统方式解决克隆羊的问题.png)

## 2.2、代码演示（src）

## 2.3、传统方式的优缺点

- 优点是比较好理解，简单易操作。
- 在创建新的对象时，总是需要重新获取原始对象的属性，如果创建的对象比较复杂时，效率较低。
- 总是需要重新初始化对象，而不是动态地获得对象运行时的状态，不够灵活。
- 改进思路分析
  - **思路**：Java中Object类是所有类的根类，Object类提供了一个clone（)方法，该方法可以
    将一个Java对象复制一份，但是需要实现clone的Java类必须要实现一个接口Cloneable，
    该接口表示该类能够复制且具有复制的能力  ==>  **原型模式**

# 3、原型模式-基本介绍

- 原型模式（Prototype模式）是指：用原型实例指定创建对象的种类，并且通过拷贝这些原型，创建新的对象
- 原型模式是一种**创建型设计模式**，允许一个对象再创建另外一个可定制的对象，无需知道如何创建的细节
- 工作原理是：通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的对象通过请求原型对象拷贝它们自己来实施创建，即   **对象.clone()**
- 形象的理解：孙大圣拔出猴毛，变出其它孙大圣

- 原理结构图

![1563241910537](images\原型模式类图.png)

- 原理结构图说明：
  - Prototype：原型类，声明一个克隆自己的接口。
  - ConcretePrototype：具体的实现类，实现一个克隆自己的操作。
  - Client：让一个原型对象克隆自己，从而创建一个新的对象（属性一样）

# 4、原型模式在Spring框架中源码分析

- Spring中原型bean的创建，就是原型模式的应用
- 
- ![1563243069597](images\spring中创建bean使用原型模式.png)

# 5、浅拷贝和深拷贝

- 对于数据类型是基本数据类型的成员变量，浅拷贝会直接进行值传递，也就是将该属值复制一份给新的对象。
- 对于数据类型是引用数据类型的成员变量，比如说成员变量是某个数组、某个类的对象等，那么浅拷贝会进行引用的传递，也就是只是将该成员变量的引用值（内存地址）复制一份给新的对象。因为实际上两个对象的该成员变量都指向同一个实例。在这种情况下，**在一个对象中修改成员变量会影响到另一个对象的该成员变量值**。
- 前面我们克隆羊就是浅拷贝
- 浅拷贝是使用默认的 clone（）方法来实现
  sheep = (Sheep) **super.clone();**

- 如果克隆的属性是一个引用型变量，那么：
  - **浅拷贝**：不会复制引用型变量所指向的堆内存
  - **深拷贝**：会复制引用型变量并开辟新的堆内存



## 深拷贝

- 复制对象的所有基本数据类型的成员变量值

- 为所有引用数据类型的成员变量申请存储空间，并复制每个引用数据类型成员变量所引用的对象，直到该对象可达的所有对象。也就是说，对象进行深拷贝要对整个对象进行拷贝。

- 深拷贝实现方式1：重写clone方法来实现深拷贝

  ```java
  //深拷贝 - 方式1 ：使用clone方法
  @Override
  protected Object clone() throws CloneNotSupportedException {
      Object deep = null;
      //这里完成对基本数据类型和字符串属性的克隆
      deep = super.clone();
  
      //对引用类型的属性进行单独的处理
      DeepProtoType deepProtoType = (DeepProtoType) deep;
      //调用引用数据类型对象的clone方法  让它自己克隆  然后赋值给本类的引用类型
      deepProtoType.deepCloneableTarget = 
          (DeepCloneableTarget) deepCloneableTarget.clone();
      return deepProtoType;
  }
  ```

  

- 深拷贝实现方式2：通过对象序列化实现深拷贝(**推荐使用**)

  ```java
  //深拷贝 - 方式2 ： 通过对象的序列化实现深拷贝（推荐使用）
  public Object deepClone(){
      //创建流对象
      ByteArrayOutputStream bos = null;
      ObjectOutputStream oos = null;
      ByteArrayInputStream bis = null;
      ObjectInputStream ois = null;
      Object target = null;
      try{
          //序列化
          bos = new ByteArrayOutputStream();
          oos = new ObjectOutputStream(bos);
          //当前这个对象以对象流的方式输出  如果成员变量中有引用型变量，也会被输出
          oos.writeObject(this);
  
          //反序列化
          bis = new ByteArrayInputStream(bos.toByteArray());
          ois = new ObjectInputStream(bis);
          target = ois.readObject();
      }catch (Exception e){
          e.printStackTrace();
      }finally {
          try {
              bos.close();
              oos.close();
              bis.close();
              ois.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
      return target;
  }
  ```



# 6、原型模式的注意事项和细节

- 创建新的对象比较复杂时，可以利用原型模式简化对象的创建过程，同时也能够提
  高效率
- 不用重新初始化对象，而是动态地获得对象运行时的状态（也就是说，如果一个对象的状态在不断的发生变化，那么使用原型模式进行克隆时能获取到那一时刻的运行时状态进行克隆）。
- 如果原始对象发生变化(增加或者减少属性)，其它克隆对象的也会发生相应的变化，无需修改代码
- 在实现深克隆的时候可能需要比较复杂的代码。
- **缺点**：需要为每一个类配备一个克隆方法，这对全新的类来说不是很难，但对已有
  的类进行改造时，需要修改其源代码，违背了ocp原则。