package simpleFactory.b_简单工厂实现实例;


/**
 * 简单工厂类
 */
public class SimpleFactory {
    /**
     * 根据orderType 返回对应的pizza对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if("greek".equals(orderType)){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if("cheese".equals(orderType)){
            pizza = new CheesePizza();
            pizza.setName("奶油披萨");
        }
        //输出pizza  制作过程
        return pizza;
    }
}
