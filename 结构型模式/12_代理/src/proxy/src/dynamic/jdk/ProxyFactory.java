package dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author:
 * @Date:2019/7/18
 * @Description:dynamic.jdk
 * @Version:1.0
 */
public class ProxyFactory {
    /**
     * 维护一个目标对象
     */
    private Object target;

    //构造器
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        /**
         * ClassLoader loader ：指定当前目标对象使用的类加载器，获取加载器的方法固定
         * Class<?>[] interfaces ：目标对象实现的接口类型，使用泛型方法确认类型
         * InvocationHandler h：事情处理，执行目标对象的方法时，会出发事情处理器方法，会把当前执行的目标对象方法作为参数传入
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk 代理开始");
                        //通过反射机制，调用目标对象的方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("jdk 代理结束");
                        return returnValue;
                    }
                });
    }
}
