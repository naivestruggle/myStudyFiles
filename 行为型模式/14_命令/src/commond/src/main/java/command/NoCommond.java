package command;

/**
 * 空命令
 * 没有任何命令，即空执行，用于初始化每个按钮，当调用空命令时，对象什么都不做即可
 * 其实，这也是一种设计模式，这种设计模式可以省掉对空的判断
 */
public class NoCommond implements Command {
    /**
     * 执行操作（动作）
     */
    @Override
    public void execute() {

    }

    /**
     * 撤销操作（动作）
     */
    @Override
    public void undo() {

    }
}
