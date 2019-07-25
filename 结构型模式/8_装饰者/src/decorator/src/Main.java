/**
 * @Author:
 * @Date:2019/7/16
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        //装饰者模式下的订单：2份巧克力 + 一份奶的LongBlack

        //1、点一份 LongBlack
        Drink drink = new LongBlack();
        System.out.println("1====描述："+drink.getDes());
        System.out.println("1----费用："+drink.cost());
        System.out.println("____________________________________________________________");

        //2、加入牛奶
        drink = new Milk(drink);
        System.out.println("2====描述："+drink.getDes());
        System.out.println("2----费用："+drink.cost());
        System.out.println("____________________________________________________________");

        //3、加入巧克力
        drink = new Chocolate(drink);
        System.out.println("3====描述："+drink.getDes());
        System.out.println("3----费用："+drink.cost());
        System.out.println("____________________________________________________________");

        //4、加入第二份巧克力
        drink = new Chocolate(drink);
        System.out.println("4====描述："+drink.getDes());
        System.out.println("4----费用："+drink.cost());
        System.out.println("____________________________________________________________");


    }
}
