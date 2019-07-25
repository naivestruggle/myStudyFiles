package improve;

/**
 * @Author:
 * @Date:2019/7/25
 * @Description:improve
 * @Version:1.0
 */
public class NoFly implements Fly {
    @Override
    public void fly() {
        System.out.println("不会飞翔");
    }
}
