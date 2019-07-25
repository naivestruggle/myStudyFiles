/**
 * 抽奖活动对象
 */
public class RaffleActive {
    /**
     * 活动状态
     */
    private State state;
    /**
     * 活动奖品数
     */
    private int count = 0;
    /**
     * 不能抽奖的状态
     */
    private State noRaffleState = new NoRaffleState(this);
    /**
     * 可以抽奖的状态
     */
    private State canRaffleState = new CanRaffleState(this);
    /**
     * 发放奖品的状态
     */
    private State dispenseState = new DispenseState(this);
    /**
     * 奖品发完的状态
     */
    private State dispenseOutState = new DispenseOutState(this);

    /**
     * 构造器  初始化当前活动的状态和奖品的数量
     * @param count
     */
    public RaffleActive(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    /**
     * 扣积分
     */
    public void deductMoney(){
        state.deductMoney();
    }

    /**
     * 抽奖
     */
    public void raffle(){
        //如果当前的状态是抽奖成功  就去领取建品
        if(state.raffle()){
            state.dispensePrize();
        }
    }

    /**
     * 每领一次奖品   奖品数减一
     * @return
     */
    public int getCount() {
        int curCount = count;
        count --;
        return curCount;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setState(State state) {
        this.state = state;
    }
}
