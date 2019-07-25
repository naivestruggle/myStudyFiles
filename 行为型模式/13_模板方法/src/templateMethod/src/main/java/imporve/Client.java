package imporve;

/**
 * 钩子方法测试
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("----------制作红豆豆浆------------");
        SoyaMilk redSoyaMilk = new RedBeanSoyaMilk();
        redSoyaMilk.make();

        System.out.println("----------制作花生豆浆------------");
        SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
        peanutSoyaMilk.make();

        System.out.println("----------制作纯豆浆------------");
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
