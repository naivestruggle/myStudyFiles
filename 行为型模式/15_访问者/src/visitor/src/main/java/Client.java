/**
 * @Author:
 * @Date:2019/7/20
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure objectStructure = new ObjectStructure();

        objectStructure.attach(new Man());
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);
    }
}
