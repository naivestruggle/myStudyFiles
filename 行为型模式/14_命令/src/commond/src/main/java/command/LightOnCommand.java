package command;

/**
 * 灯的打开命令
 */
public class LightOnCommand implements Command {

    /**
     * 聚合LightReceiver
     */
    private LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    /**
     * 执行操作（动作）
     */
    @Override
    public void execute() {
        //调用接受者的方法
        light.on();
    }

    /**
     * 撤销操作（动作）
     */
    @Override
    public void undo() {
        light.off();
    }
}
