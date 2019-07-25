package factory;

import pizza.BJCheesePizza;
import pizza.BJPepperPizza;
import pizza.Pizza;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:factory
 * @Version:1.0
 */
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if("cheese".equals(orderType)){
            pizza = new BJCheesePizza();
        }else if("pepper".equals(orderType)){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
