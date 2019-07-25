package classAdapter;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:classAdapter
 * @Version:1.0
 */
public class Phone {
    /**
     * 充电
     * @param voltage5V
     */
    public void charging(Voltage5V voltage5V){
        if(voltage5V.ouput5V() == 5){
            System.out.println("电压："+ voltage5V.ouput5V() +" 正在充电...");
        }else{
            System.out.println("不能充电");
        }
    }
}
