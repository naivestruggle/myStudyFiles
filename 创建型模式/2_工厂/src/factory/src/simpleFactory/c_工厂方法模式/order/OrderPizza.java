package simpleFactory.c_工厂方法模式.order;

import simpleFactory.c_工厂方法模式.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.c_工厂方法模式
 * @Version:1.0
 */
public abstract class OrderPizza {
    /**
     * 创建披萨对象
     * 定义抽象方法，让各个工厂子类自己实现
     * @return
     */
    public abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do{
            orderType = getType();
            pizza = createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("没有此披萨");
            }

        }while (true);
    }

    //写一个方法  可以获取客户希望订购的披萨种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类：");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
