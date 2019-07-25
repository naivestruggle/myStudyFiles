package command;

/**
 * 命令接口
 */
public interface Command {
    /**
     * 执行操作（动作）
     */
    public void execute();

    /**
     * 撤销操作（动作）
     */
    public void undo();
}
