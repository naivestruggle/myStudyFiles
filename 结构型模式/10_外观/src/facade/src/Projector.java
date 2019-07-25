/**
 * 投影仪
 */
public class Projector {
    //使用单例模式，使用饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("投影仪 -- 打开");
    }
    public void off(){
        System.out.println("投影仪 -- 关闭");
    }
    public void facus(){
        System.out.println("投影仪 -- 聚焦");
    }
}
