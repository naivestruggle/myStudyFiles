/**
 * 奖品发完的状态
 */
public class DispenseOutState implements State {

    /**
     * 初始化时传入活动引用
     */
    RaffleActive active;

    public DispenseOutState(RaffleActive active) {
        this.active = active;
    }


    /**
     * 扣除积分
     */
    @Override
    public void deductMoney() {
        System.out.println("奖品发放完了，请下次再参加");
    }

    /**
     * 抽奖
     *
     * @return 抽中返回true
     */
    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了，请下次再参加");
        return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了，请下次再参加");
    }
}
