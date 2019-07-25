package dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author:
 * @Date:2019/7/18
 * @Description:dynamic.cglib
 * @Version:1.0
 */
public class ProxyFactory implements MethodInterceptor {

    //维护一个目标对象
    private Object target;

    //构造器，传入一个被代理的对象
    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回一个target的代理对象
     * @return
     */
    public Object getProxyInstance(){
        //1、创建工具类
        Enhancer enhancer = new Enhancer();

        //2、设置父类
        enhancer.setSuperclass(target.getClass());

        //3、设置回调函数
        enhancer.setCallback(this);

        //4、创建子类对象，即代理对象,并返回
        return enhancer.create();
    }

    /**
     * 重写 这个方法 ，这个方法中会调用目标对象的方法
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理模式 ~~ 开始");
        Object returnValue = method.invoke(target, objects);
        System.out.println("Cglib代理提交");
        return returnValue;
    }
}
