/**
 * @Author:
 * @Date:2019/7/17
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        //这里直接调用。。很麻烦，扩展性也低

        //所以使用一个外观类
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.ready();
        homeTheaterFacade.play();
    }
}
