package classAdapter;

/**
 * 被适配者
 */
public class Voltage220V {
    /**
     * 输出220V电压
     * @return
     */
    public int output220V(){
        int src = 220;
        System.out.println("电压 = "+src + " 伏");
        return src;
    }
}
