package simpleFactory.b_简单工厂实现实例;


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
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    //定义一个简单工厂对象
    private SimpleFactory simpleFactory;
    private Pizza pizza = null;
    private void setFactory(SimpleFactory simpleFactory){
        //用户输入的
        String orderType = "";

        this.simpleFactory = simpleFactory;
        do{
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cat();
                pizza.box();
            }else{
                System.out.println("没有这类披萨");
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
