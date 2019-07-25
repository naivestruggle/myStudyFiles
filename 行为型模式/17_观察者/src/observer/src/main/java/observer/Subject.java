package observer;

/**
 * 接口，让WeatherData来实现
 */
public interface Subject {

    /**
     * 注册一个观察者
     * @param observer  观察者
     */
    public void registerObserver(Observer observer);

    /**
     * 移除一个观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers();
}
