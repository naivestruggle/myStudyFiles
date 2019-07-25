/**
 * 状态接口
 */
public interface State {
    /**
     * 扣除积分
     */
    public void deductMoney();

    /**
     * 抽奖
     * @return  抽中返回true
     */
    public boolean raffle();

    /**
     * 发放奖品
     */
    public void dispensePrize();
}
