package 普通方式.提供者推送;

/**
 * 核心类
 * 1、包含最新的天气情况
 * 2、含有CurrentConditions对象
 * 3、当数据有更新时，就主动的调用CurrentConditions对象update方法（含display），这样他们（接入方）就看到最新的消息了
 */
public class WeatherData {
    private float temperatrue;
    private float pressure;
    private float humidity;

    /**
     * 当前天气情况
     */
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    /**
     * 将最新的信息推送给接入方
     */
    public void dataChange(){
        //调用接入方的update方法
        currentConditions.update(getTemperatrue(),getPressure(),getHumidity());
    }

    /**
     * 当数据有更新时，就调用setData
     * @param temperatrue   温度
     * @param pressure      湿度
     * @param humidity      气压
     */
    public void setData(float temperatrue,float pressure,float humidity){
        this.temperatrue = temperatrue;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }


    public float getTemperatrue() {
        return temperatrue;
    }

    public void setTemperatrue(float temperatrue) {
        this.temperatrue = temperatrue;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
