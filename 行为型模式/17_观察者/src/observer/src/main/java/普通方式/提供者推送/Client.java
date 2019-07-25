package 普通方式.提供者推送;

/**
 * @Author:
 * @Date:2019/7/23
 * @Description:普通方式.提供者推送
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建接入方  currentConditions
        CurrentConditions currentConditions = new CurrentConditions();

        //创建WeatherData 并将接入方currentConditions传递到WeatherData中
        WeatherData weatherData = new WeatherData(currentConditions);

        //更新天气情况
        weatherData.setData(30,150,40);

        //天气情况变了
        System.out.println("======天气情况变化=========");
        weatherData.setData(20,35,158);
    }
}
