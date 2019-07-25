package order;

import factory.AbsFactory;
import pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:order
 * @Version:1.0
 */
public class OrderPizza {
    public OrderPizza(AbsFactory absFactory){
        Pizza pizza = null;
        String orderType;
        do{
            orderType = getType();
            pizza = absFactory.createPizza(orderType);
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
