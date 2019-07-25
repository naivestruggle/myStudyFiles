/**
 * 红豆豆浆
 */
public class RedBeanSoyaMilk extends SoyaMilk {
    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    @Override
    public void addCondiments() {
        System.out.println("第二步：加入上好的红豆");
    }
}
