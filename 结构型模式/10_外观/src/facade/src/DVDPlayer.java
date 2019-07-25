/**
 * DVD播放器
 */
public class DVDPlayer {
    //使用单例模式，使用饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD播放器 -- 打开");
    }
    public void off(){
        System.out.println("DVD播放器 -- 关闭");
    }
    public void play(){
        System.out.println("DVD播放器 -- 播放");
    }

    public void pause(){
        System.out.println("DVD播放器 -- 暂停");
    }
}
