package old;

/**
 * 北京鸭
 */
public class PekingDuck extends Duck{
    /**
     * 显示信息
     */
    @Override
    public void display() {
        System.out.println("我是北京鸭");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不能游泳");
    }
}
