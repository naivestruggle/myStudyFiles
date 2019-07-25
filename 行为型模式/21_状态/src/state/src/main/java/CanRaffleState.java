import java.util.Random;

/**
 * 可以抽奖的状态
 */
public class CanRaffleState implements State{
    /**
     * 初始化时传入活动引用
     */
    RaffleActive active;

    public CanRaffleState(RaffleActive active) {
        this.active = active;
    }


    /**
     * 扣除积分
     */
    @Override
    public void deductMoney() {
        System.out.println("已经扣除过积分了");
    }

    /**
     * 抽奖
     *
     * @return 抽中返回true
     */
    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等");
        Random random = new Random();
        int num = random.nextInt(10);
        //10%的中奖机会
        if(num == 0){
            //表示中奖  改变活动状态为发放奖品
            active.setState(active.getDispenseState());
            return true;
        }else{
            //没有中奖
            System.out.println("很遗憾，您没有中奖！");
            //改变状态为不能抽奖
            active.setState(active.getNoRaffleState());
            return false;
        }
    }

    /**
     * 发放奖品
     */
    @Override
    public void dispensePrize() {
        System.out.println("正在抽奖，不能发放奖品");
    }
}
