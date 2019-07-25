package pizza;

/**
 * 北京的奶酪披萨
 */
public class BJCheesePizza extends Pizza {
    /**
     * 选择原材料
     */
    @Override
    public void prepare() {
        System.out.println("给北京奶酪披萨选择原材料");
        setName("北京奶酪披萨");
    }
}
