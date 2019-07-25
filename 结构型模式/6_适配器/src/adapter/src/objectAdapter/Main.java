package objectAdapter;



/**
 * @Author:
 * @Date:2019/7/16
 * @Description:objectAdapter
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        //充电
        new Phone().charging(new VoltagerAdapter(new Voltager220V()));
    }
}
