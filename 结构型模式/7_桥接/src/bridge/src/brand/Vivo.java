package brand;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:brand
 * @Version:1.0
 */
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo 手机开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo 手机关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo 手机打电话");
    }
}
