package objectAdapter;


/**
 * @Author:
 * @Date:2019/7/16
 * @Description:objectAdapter
 * @Version:1.0
 */
public class Phone {
    public void charging(Voltager5V voltage5V){
        if(voltage5V.output5V() == 5){
            System.out.println("电压："+voltage5V.output5V()+"伏，正在充电");
        }else{
            System.out.println("电压不正确");
        }
    }
}
