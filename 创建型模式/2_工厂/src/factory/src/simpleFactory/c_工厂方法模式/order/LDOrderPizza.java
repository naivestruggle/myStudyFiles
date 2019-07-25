package simpleFactory.c_工厂方法模式.order;

import simpleFactory.c_工厂方法模式.pizza.LDCheesePizza;
import simpleFactory.c_工厂方法模式.pizza.LDPepperPizza;
import simpleFactory.c_工厂方法模式.pizza.Pizza;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.c_工厂方法模式
 * @Version:1.0
 */
public class LDOrderPizza extends OrderPizza {
    /**
     * 创建披萨对象
     *
     * @return
     */
    @Override
    public Pizza createPizza(String orderType) {
        if("lunduncheese".equals(orderType)){
            return new LDCheesePizza();
        }else if("lundunpepper".equals(orderType)){
            return new LDPepperPizza();
        }
        return null;
    }
}
