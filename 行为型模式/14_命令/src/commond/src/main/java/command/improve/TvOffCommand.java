package command.improve;

import command.Command;

/**
 * 电视机关的命令
 */
public class TvOffCommand implements Command {
    /**
     * 聚合TvReceiver
     */
    private TvReceiver tv;

    public TvOffCommand(TvReceiver tv) {
        this.tv = tv;
    }

    /**
     * 执行操作（动作）
     */
    @Override
    public void execute() {
        tv.off();
    }

    /**
     * 撤销操作（动作）
     */
    @Override
    public void undo() {
        tv.on();
    }
}
