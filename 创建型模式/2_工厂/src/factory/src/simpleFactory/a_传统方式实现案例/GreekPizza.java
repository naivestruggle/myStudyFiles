package simpleFactory.a_传统方式实现案例;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.传统方式实现案例
 * @Version:1.0
 */
public class GreekPizza extends Pizza {
    /**
     * 准备原材料
     */
    @Override
    void prepare() {
        System.out.println("给制作希腊披萨准备原材料...");
    }

}
