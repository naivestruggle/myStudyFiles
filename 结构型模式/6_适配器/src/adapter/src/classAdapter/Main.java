package classAdapter;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:classAdapter
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        Voltage5V voltage5V = new VoltageAdapter();
        Phone phone = new Phone();
        phone.charging(voltage5V);
    }
}
