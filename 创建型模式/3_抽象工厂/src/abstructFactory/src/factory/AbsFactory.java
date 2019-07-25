package factory;

import pizza.Pizza;

/**
 * 抽象工厂  接口
 */
public interface AbsFactory {
    public Pizza createPizza(String orderType);
}
