package a_饿汉式_静态常量;

/**
 * @Author:
 * @Date:2019/7/14
 * @Description:a_饿汉式_静态常量
 * @Version:1.0
 */
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
