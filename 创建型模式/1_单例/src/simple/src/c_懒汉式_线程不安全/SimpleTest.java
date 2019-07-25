package c_懒汉式_线程不安全;

/**
 * @Author:
 * @Date:2019/7/14
 * @Description:a_懒汉式_线程不安全
 * @Version:1.0
 */
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
