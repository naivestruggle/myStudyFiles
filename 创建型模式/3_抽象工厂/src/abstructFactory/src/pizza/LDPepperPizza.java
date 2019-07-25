package pizza;


/**
 * 伦敦的胡椒披萨
 */
public class LDPepperPizza extends Pizza {

    /**
     * 选择原材料
     */
    @Override
    public void prepare() {
        System.out.println("给伦敦胡椒披萨选择原材料");
        setName("伦敦胡椒披萨");
    }
}
