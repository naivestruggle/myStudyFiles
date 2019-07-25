package g_静态内部类;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:g_静态内部类
 * @Version:1.0
 */
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
