/**
 * 影院灯光
 */
public class TheaterLight {
    //使用单例模式，使用饿汉式
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("灯光 -- 打开");
    }
    public void off(){
        System.out.println("灯光 -- 关闭");
    }
    public void dim(){
        System.out.println("灯光 -- 调暗...");
    }

    public void bright(){
        System.out.println("灯光 -- 调亮...");
    }
}
