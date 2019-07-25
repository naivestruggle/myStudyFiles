/**
 * @Author:
 * @Date:2019/7/17
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class HomeTheaterFacade {
    //定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    //操作分成4步

    /**
     * 1、准备工作
     */
    public void ready(){
        popcorn.on();
        popcorn.pop();
        screen.up();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    /**
     * 2、播放
     */
    public void play(){
        dvdPlayer.play();
    }

    /**
     * 3、暂停
     */
    public void pause(){
        dvdPlayer.pause();
    }

    /**
     * 观影结束
     */
    public void end(){
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
