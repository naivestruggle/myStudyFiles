import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        User bean = (User) applicationContext.getBean("id01");
        User bean2 = (User) applicationContext.getBean("id01");
        System.out.println(bean == bean2);
        System.out.println(bean.hashCode() == bean2.hashCode());
        System.out.println(bean.equals(bean2));
        //两次产生的bean对象不是同一个  也就是spring的多例创建bean  创建的方式是用原型模式 对象.clone
    }
}
