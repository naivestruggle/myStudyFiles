package interfaceAdapter;

/**
 * 手机监听
 */
public interface PhoneListener {
    /**
     * 开机
     */
    public void onStart();

    /**
     * 关机
     */
    public void onStop();

    /**
     * 打电话
     */
    public void onCall();

    /**
     * 充电
     */
    public void onCharging();

    /**
     * 玩游戏
     */
    public void onPlayGame();
}
