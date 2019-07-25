import factory.BJFactory;
import factory.LDFactory;
import order.OrderPizza;

import java.util.Calendar;

/**
 * @Author:
 * @Date:2019/7/15
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
//        new OrderPizza(new BJFactory());
        new OrderPizza(new LDFactory());
        Calendar cal = Calendar.getInstance();
    }
}
