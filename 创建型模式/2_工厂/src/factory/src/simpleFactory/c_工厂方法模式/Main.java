package simpleFactory.c_工厂方法模式;

import simpleFactory.c_工厂方法模式.order.BJOrderPizza;
import simpleFactory.c_工厂方法模式.order.LDOrderPizza;
import simpleFactory.c_工厂方法模式.order.OrderPizza;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.c_工厂方法模式
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        new BJOrderPizza();
//        new LDOrderPizza();
    }
}
