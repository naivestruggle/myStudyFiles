package com.yxh.principle.inversion.improve;

/**
 * 依赖倒转（倒置）原则
 */
public class DependecyInversion2 {
    public static void main(String[] args) {
        //客户端不无需改变
        Person2 person = new Person2();
//        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

/**
 * 定义接口
 */
interface  IReceiver{
    public String getInfo();
}

class Email2 implements IReceiver{
    @Override
    public String getInfo(){
        return "电子邮件信息：hello , world";
    }
}

class WeiXin implements IReceiver{

    @Override
    public String getInfo() {
        return "hello ok weixin ...";
    }
}

class Person2{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
