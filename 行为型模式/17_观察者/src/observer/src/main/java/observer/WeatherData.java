package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 核心类
 * 1、包含最新的天气情况
 * 2、含有观察者集合
 * 3、当数据有更新时，就主动的遍历ArrayList，通知所有的（接入方）就看到最新的消息
 */
public class WeatherData implements Subject{
    private float temperatrue;
    private float pressure;
    private float humidity;

    private List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    /**
     * 将最新的信息推送给接入方
     */
    public void dataChange(){
        //调用接入方的update方法
//        currentConditions.update(getTemperatrue(),getPressure(),getHumidity());
        notifyObservers();
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

    /**
     * 注册一个观察者
     *
     * @param observer 观察者
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除一个观察者
     *
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    /**
     * 通知所有观察者
     */
    @Override
    public void notifyObservers() {
        int size = observers.size();
        for (int i=0;i < size;i++){
            observers.get(i).update(this.temperatrue,this.pressure,this.humidity);
        }
    }
}
