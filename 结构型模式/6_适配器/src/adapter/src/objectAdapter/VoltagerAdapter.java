package objectAdapter;


/**
 * @Author:
 * @Date:2019/7/16
 * @Description:objectAdapter
 * @Version:1.0
 */
public class VoltagerAdapter implements Voltager5V {
    private Voltager220V voltager220V;
    public VoltagerAdapter(Voltager220V voltage220V){
        this.voltager220V = voltage220V;
    }
    /**
     * 输出5V电压
     *
     * @return
     */
    @Override
    public int output5V() {
        //转换并输出
        return voltager220V.output220V() / 44;
    }

}
