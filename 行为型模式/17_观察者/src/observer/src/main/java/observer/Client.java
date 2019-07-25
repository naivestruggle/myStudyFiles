package observer;

/**
 * @Author:
 * @Date:2019/7/23
 * @Description:普通方式.提供者推送
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方(观察者)  currentConditions
        CurrentConditions currentConditions = new CurrentConditions();

        //创建WeatherData
        WeatherData weatherData = new WeatherData();

        //将观察者注册到WeatherData
        weatherData.registerObserver(currentConditions);

        /**
         * 扩展  ：加入了BaiDu公司
         */
        BaiDu baiDu = new BaiDu();
        //将百度公司注册到气象站
        weatherData.registerObserver(baiDu);




        //更新天气情况
        weatherData.setData(30,150,40);

        //天气情况变了
        System.out.println("======天气情况变化=========");
        weatherData.setData(20,35,158);





    }
}
