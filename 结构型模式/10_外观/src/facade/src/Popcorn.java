/**
 * 爆米花机
 */
public class Popcorn {
    //使用单例模式，使用饿汉式
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("爆米花机 -- 打开");
    }
    public void off(){
        System.out.println("爆米花机 -- 关闭");
    }
    public void pop(){
        System.out.println("爆米花机 -- 出爆米花");
    }
}
