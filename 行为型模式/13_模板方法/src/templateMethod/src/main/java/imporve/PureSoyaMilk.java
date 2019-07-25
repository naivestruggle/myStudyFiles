package imporve;

/**
 * 纯豆浆
 */
public class PureSoyaMilk extends SoyaMilk {
    /**
     * 添加不同的配料，抽象方法，子类具体实现
     */
    @Override
    public void addCondiments() {
        //空实现  不需要添加配料
    }

    /**
     * 钩子方法，决定是否需要添加配料
     */
    @Override
    public boolean customerWantCondiments() {
        return false;
    }
}
