package observer;

/**
 * @Author:
 * @Date:2019/7/23
 * @Description:observer
 * @Version:1.0
 */
public class BaiDu implements Observer {
    /**
     * 更新
     *
     * @param temperature 温度
     * @param pressure    湿度
     * @param humidity    气压
     */
    @Override
    public void update(float temperature, float pressure, float humidity) {
        System.out.println("百度接受到了消息");
    }
}
