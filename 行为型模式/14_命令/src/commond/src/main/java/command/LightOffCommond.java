package command;

/**
 * 灯的关闭命令
 */
public class LightOffCommond implements Command{


    /**
     * 聚合LightReceiver
     */
    private LightReceiver light;

    public LightOffCommond(LightReceiver light) {
        this.light = light;
    }

    /**
     * 执行操作（动作）
     */
    @Override
    public void execute() {
        light.off();
    }

    /**
     * 撤销操作（动作）
     */
    @Override
    public void undo() {
        light.on();
    }
}
