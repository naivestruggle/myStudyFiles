package pizza;

/**
 * 伦敦的奶酪披萨
 */
public class LDCheesePizza extends Pizza {
    /**
     * 选择原材料
     */
    @Override
    public void prepare() {
        System.out.println("给伦敦奶酪披萨选择原材料");
        setName("伦敦奶酪披萨");
    }
}
