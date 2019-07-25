package factory;

import pizza.LDCheesePizza;
import pizza.LDPepperPizza;
import pizza.Pizza;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:factory
 * @Version:1.0
 */
public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new LDCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
