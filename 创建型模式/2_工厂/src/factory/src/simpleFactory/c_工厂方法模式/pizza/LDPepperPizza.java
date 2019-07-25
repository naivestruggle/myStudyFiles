package simpleFactory.c_工厂方法模式.pizza;


/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.c_工厂方法模式
 * @Version:1.0
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
