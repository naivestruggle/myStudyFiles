package dynamic.cglib;

/**
 * @Author:
 * @Date:2019/7/18
 * @Description:dynamic.cglib
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao target = new TeacherDao();

        ProxyFactory factory = new ProxyFactory(target);

        TeacherDao instance = (TeacherDao) factory.getProxyInstance();

        instance.teach();
    }
}
