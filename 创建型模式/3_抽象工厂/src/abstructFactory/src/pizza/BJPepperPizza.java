package pizza;

/**
 * 北京的胡椒披萨
 */
public class BJPepperPizza extends Pizza {
    /**
     * 选择原材料
     */
    @Override
    public void prepare() {
        System.out.println("给北京胡椒披萨选择原材料");
        setName("北京胡椒披萨");
    }
}
