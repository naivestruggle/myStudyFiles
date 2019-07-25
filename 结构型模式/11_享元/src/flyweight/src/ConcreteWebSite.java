/**
 * 具体是什么类型的网站
 */
public class ConcreteWebSite extends WebSite{
    /**
     * 网站发布的形式（类型）
     * 共享的部分，内部状态
     */
    private String type;

    /**
     * 构造器
     * @param type
     */
    public ConcreteWebSite(String type) {
        this.type = type;
    }

    /**
     * 使用网站
     */
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为："+type+"...使用者是："+user.getName());
    }
}
