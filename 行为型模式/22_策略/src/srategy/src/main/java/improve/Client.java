package improve;

/**
 * @Author:
 * @Date:2019/7/25
 * @Description:improve
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        GoodFly goodFly = new GoodFly();
        NoFly noFly = new NoFly();

        Duck duck = new Duck(goodFly);
        Duck duck2 = new Duck(noFly);

        duck.fly();
        duck2.fly();
    }
}
