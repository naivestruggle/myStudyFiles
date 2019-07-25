package observer;

/**
 * 显示当前的天气情况（可以理解成是气象站自己的网站）
 */
public class CurrentConditions implements Observer{
    /**
     * 温度
     */
    private float temperature;
    /**
     * 湿度
     */
    private float pressure;
    /**
     * 气压
     */
    private float humifity;

    /**
     * 更新天气情况，是由WeatherData来调用，这里使用推送的模式
     * @param temperature   温度
     * @param pressure      湿度
     * @param humifity      气压
     */
    @Override
    public void update(float temperature, float pressure, float humifity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humifity = humifity;
        display();
    }

    /**
     * 显示
     */
    public void display(){
        System.out.println("====Today mTemperature:" + temperature + "====");
        System.out.println("====Today mPressure:" + pressure + "====");
        System.out.println("====Today mHumidity:" + humifity + "====");
    }
}
