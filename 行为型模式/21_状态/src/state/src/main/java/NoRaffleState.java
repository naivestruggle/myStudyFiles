/**
 * 不能抽奖的状态
 */
public class NoRaffleState implements State {
    /**
     * 初始化时传入活动引用，扣除积分后改变其状态
     */
    RaffleActive active;

    public NoRaffleState(RaffleActive active) {
        this.active = active;
    }

    /**
     * 扣除积分
     * 当前状态可以扣积分，扣除后将状态设置为可以抽奖状态
     */
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分，您可以抽奖了");
        active.setState(active.getCanRaffleState());
    }

    /**
     * 抽奖
     * 在当前状态不能抽奖
     * @return 抽中返回true
     */
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖哦！");
        return false;
    }

    /**
     * 发放奖品
     * 当前状态不能发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }
}
