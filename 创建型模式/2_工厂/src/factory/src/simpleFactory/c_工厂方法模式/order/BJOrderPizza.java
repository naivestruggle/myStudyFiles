package simpleFactory.c_工厂方法模式.order;


import simpleFactory.c_工厂方法模式.pizza.BJCheesePizza;
import simpleFactory.c_工厂方法模式.pizza.BJPepperPizza;
import simpleFactory.c_工厂方法模式.pizza.Pizza;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.c_工厂方法模式
 * @Version:1.0
 */
public class BJOrderPizza extends OrderPizza {
    /**
     * 创建披萨对象
     *
     * @return
     */
    @Override
    public Pizza createPizza(String orderType) {
        if("beijincheese".equals(orderType)){
            return new BJCheesePizza();
        }else if("beijinpepper".equals(orderType)){
            return new BJPepperPizza();
        }
        return null;
    }
}
