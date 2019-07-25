package old;

/**
 * 玩具鸭
 */
public class ToyDuck extends Duck {
    /**
     * 显示信息
     */
    @Override
    public void display() {
        System.out.println("我是玩具鸭");
    }

    /**
     * 玩具鸭不能叫、游泳、飞翔  所以要重写父类的所有方法
     */
    @Override
    public void quack() {
        System.out.println("玩具鸭不能叫");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭不能游泳");
    }

    @Override
    public void fly() {
        System.out.println("玩具鸭不能飞翔");
    }
}
