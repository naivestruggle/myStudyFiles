/**
 * @Author:
 * @Date:2019/7/18
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        SoyaMilk redSoyaMilk = new RedBeanSoyaMilk();
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();

        redSoyaMilk.make();
        System.out.println("----------------------");
        peanutSoyaMilk.make();
    }
}
