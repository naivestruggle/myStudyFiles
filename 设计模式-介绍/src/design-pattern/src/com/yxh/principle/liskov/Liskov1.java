package com.yxh.principle.liskov;

/**
 * 里氏替换原则
 */
public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11 - 3 = "+a.fun1(11,3));
        System.out.println("1 - 8 = "+a.fun1(1,8));

        System.out.println("-----------------------");
        B b = new B();
        //这里程序员的本意是求出 11- 3 ，但是由于B类重写了A类的方法，
        // 这种重写可能是无意识的，程序员刚好写了一个一样的方法名
        System.out.println("11 - 3 = " + b.fun1(11,3));
        System.out.println("1 - 8 = " + b.fun1(1,8));
        System.out.println("11 + 3 + 9 = " + b.fun2(11,3));
    }
}

/**
 * A类
 */
class A{
    /**
     * 返回两个数的差
     * @param num1
     * @param num2
     * @return
     */
    public int fun1(int num1 ,int num2){
        return num1 - num2;
    }
}

/**
 * B继承A
 * 增加一个新功能：完成两个数相加，然后和9求和
 */
class B extends A{
    /**
     * 重写A类的fun1方法  返回两个数的和
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public int fun1(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * 增加了一个方法fun2  调用fun1
     * @param num1
     * @param num2
     * @return
     */
    public int fun2(int num1,int num2){
        return fun1(num1,num2) + 9;
    }
}