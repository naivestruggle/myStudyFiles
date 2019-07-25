/**
 * 咖啡
 */
public class Coffee extends Drink{
    /**
     * 计算费用的抽象方法
     *
     * @return
     */
    @Override
    public float cost() {
        return super.getPrice();
    }
}
