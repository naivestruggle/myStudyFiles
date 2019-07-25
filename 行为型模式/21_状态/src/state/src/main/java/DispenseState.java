/**
 * 发放奖品的状态
 */
public class DispenseState implements State {

    /**
     * 初始化时传入活动引用
     */
    RaffleActive active;

    public DispenseState(RaffleActive active) {
        this.active = active;
    }


    /**
     * 扣除积分
     */
    @Override
    public void deductMoney() {
        System.out.println("可以发放奖品，不能扣除积分");
    }

    /**
     * 抽奖
     *
     * @return 抽中返回true
     */
    @Override
    public boolean raffle() {
        System.out.println("可以发放奖品，不能抽奖");
        return false;
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        if (active.getCount() > 0){
            //还有奖品
            System.out.println("恭喜中奖！");
            //改变状态为不能抽奖
            active.setState(active.getNoRaffleState());
        }else{
            System.out.println("很遗憾，您来晚了，奖品发放结束");
            //改变状态为奖品发放完   后面我们就不可以再抽奖了
            active.setState(active.getDispenseOutState());
        }
    }
}
