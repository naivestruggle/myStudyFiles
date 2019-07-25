import brand.HuaWei;
import brand.XiaoMi;
import phone.FoldedPhone;
import phone.Phone;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        Phone phone1 = new FoldedPhone(new HuaWei());

        phone1.open();
        phone1.close();
        phone1.call();
    }
}
