package com.yxh.principle.liskov.improve;

/**
 * 里氏替换原则
 */
public class Liskov2 {
    public static void main(String[] args) {
        A2 a = new A2();
        System.out.println("11 - 3 = "+a.fun1(11,3));
        System.out.println("1 - 8 = "+a.fun1(1,8));

        System.out.println("-----------------------");
        B2 b = new B2();
        //因为B类不再继承A类，因此调用者不会再认为fun1的求减法
        //调用完成的功能就会很明确
        System.out.println("11 + 3 = " + b.fun1(11,3));
        System.out.println("1 + 8 = " + b.fun1(1,8));
        System.out.println("11 + 3 + 9 = " + b.fun2(11,3));

        //使用组合  仍然可以使用到A类的相关方法
        System.out.println("-------------------");
        System.out.println("11 - 3 = " + b.fun3(11,3));
    }
}

/**
 * 创建一个更加基础的基类
 */
class Base{
    //把更加基础的方法和成员写到Base类

}

/**
 * A类
 */
class A2 extends Base{
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
class B2 extends Base{

    /**
     * 如果B需要使用A类的方法，使用组合的关系
     */
    private A2 a = new A2();
    //我们仍然想要使用A的方法
    public int fun3(int num1,int num2){
        return this.a.fun1(num1 , num2);
    }

    /**
     * 重写A类的fun1方法  返回两个数的和
     * @param num1
     * @param num2
     * @return
     */
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