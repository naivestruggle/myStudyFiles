package interfaceAdapter;

/**
 * @Author:
 * @Date:2019/7/16
 * @Description:interfaceAdapter
 * @Version:1.0
 */
public abstract class PhoneListenerAdapt implements PhoneListener {
    /**
     * 开机
     */
    @Override
    public void onStart() {

    }

    /**
     * 关机
     */
    @Override
    public void onStop() {

    }

    /**
     * 打电话
     */
    @Override
    public void onCall() {

    }

    /**
     * 充电
     */
    @Override
    public void onCharging() {

    }

    /**
     * 玩游戏
     */
    @Override
    public void onPlayGame() {

    }
}
