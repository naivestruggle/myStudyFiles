/**
 * 抽象类，表示豆浆
 */
public abstract class SoyaMilk {
    /**
     * 模板方法：make,模板方法可以做成final ，不让子类去覆盖。
     */
    public final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    private void select(){
        System.out.println("第一步：选择新鲜黄豆");
    }

    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    public abstract void addCondiments();

    /**
     * 浸泡
     */
    private void soak(){
        System.out.println("第二步：黄豆和配料开始浸泡，需要3小时");
    }

    /**
     * 打碎
     */
    private void beat(){
        System.out.println("第四步：黄豆和配料放到豆浆机去打碎");
    }
}
