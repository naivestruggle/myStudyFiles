package classAdapter;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:classAdapter
 * @Version:1.0
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    @Override
    public int ouput5V() {
        int src = output220V();
        int dst = adapt(src);
        return dst;
    }

    /**
     * 适配细节（降压） 转成5V
     * @param src
     * @return
     */
    private int adapt(int src) {
        src = 220 / 44;
        return src;
    }
}
