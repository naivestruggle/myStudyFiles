package observer;

/**
 * 观察者接口，由观察者来实现
 */
public interface Observer {
    /**
     * 更新
     * @param temperature   温度
     * @param pressure      湿度
     * @param humidity      气压
     */
    public void update(float temperature,float pressure,float humidity);
}
