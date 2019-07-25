package simpleFactory.c_工厂方法模式.pizza;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.c_工厂方法模式
 * @Version:1.0
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
