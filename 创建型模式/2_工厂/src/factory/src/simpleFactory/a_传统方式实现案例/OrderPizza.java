package simpleFactory.a_传统方式实现案例;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:simpleFactory.传统方式实现案例
 * @Version:1.0
 */
public class OrderPizza {
    public OrderPizza(){
        Pizza pizza = null;
        //订购披萨的类型
        String orderType;
        do{
            orderType = getType();
            if("greek".equals(orderType)){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if("cheese".equals(orderType)){
                pizza = new CheesePizza();
                pizza.setName("奶油披萨");
            }else{
                break;
            }
            //输出pizza  制作过程

            pizza.prepare();
            pizza.bake();
            pizza.cat();
            pizza.box();


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
