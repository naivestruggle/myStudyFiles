package command.improve;

import command.Command;

/**
 * 电视机开的命令
 */
public class TvOnCommand implements Command {

    /**
     * 聚合TvReceiver
     */
    private TvReceiver tv;

    public TvOnCommand(TvReceiver tv) {
        this.tv = tv;
    }


    /**
     * 执行操作（动作）
     */
    @Override
    public void execute() {
        tv.on();
    }

    /**
     * 撤销操作（动作）
     */
    @Override
    public void undo() {
        tv.off();
    }
}
