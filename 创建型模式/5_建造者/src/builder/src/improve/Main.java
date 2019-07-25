package improve;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:improve
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        //盖普通的房子
        CommonHuse commonHuse = new CommonHuse();

        //准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHuse);

        //完成盖房子，返回产品（房子）
        House house = houseDirector.constructHouse();

        System.out.println(house);
        StringBuilder sb = new StringBuilder("hello world");
    }
}
