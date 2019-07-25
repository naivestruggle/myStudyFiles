package dynamic.jdk;

/**
 * @Author:
 * @Date:2019/7/18
 * @Description:dynamic.jdk
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象（被代理对象）
        TeacherDao target = new TeacherDao();

        //给目标对象，创建代理对象，可以转成 ITeacherDao
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();

        /**
         * proxyInstance=class com.sun.proxy.$Proxy0
         * 从这里可以看出，内存中动态生成了代理对象
         */
        System.out.println("proxyInstance="+proxyInstance.getClass());

        //调用代理对象的方法
        proxyInstance.teach();

        int add = proxyInstance.add(1, 1);
        System.out.println(add);
    }
}
