package h_枚举;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:h_枚举
 * @Version:1.0
 */
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
