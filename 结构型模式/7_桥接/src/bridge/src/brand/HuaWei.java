package brand;

import phone.Phone;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:brand
 * @Version:1.0
 */
public class HuaWei implements Brand{

    @Override
    public void open() {
        System.out.println("华为手机开启");
    }

    @Override
    public void close() {
        System.out.println("华为手机关闭");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
