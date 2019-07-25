/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建活动对象，奖品有一个
        RaffleActive active = new RaffleActive(1);

        //我们连续10次抽奖
        for(int i=0;i<10;i++){
            System.out.println("--------第" + (i + 1) + "次抽奖---------");
            //参加抽奖，第一步点击扣除积分
            active.deductMoney();

            //第二步抽奖
            active.raffle();
        }
    }
}
