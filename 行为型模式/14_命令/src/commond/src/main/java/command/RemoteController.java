package command;

/**
 * @Author:
 * @Date:2019/7/20
 * @Description:command
 * @Version:1.0
 */
public class RemoteController {
    /**
     * 开按钮的命令数组
     */
    Command[] onCommands;
    Command[] offCommands;

    /**
     * 执行撤销的命令
     */
    Command undoCommand;

    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];

        for(int i=0;i<5;i++){
            onCommands[i] = new NoCommond();
            offCommands[i] = new NoCommond();
        }
    }


    /**
     * 给我们的按钮设置你需要的命令
     */
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }


    /**
     * 按下开按钮
     */
    public void onButtonWasPushed(int no){
        //找到你按下的开的按钮，并调用对应方法
        onCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     * @param no
     */
    public void offButtonWasPushed(int no){
        //找到你按下的开的按钮，并调用对应方法
        offCommands[no].execute();
        //记录这次操作，用于撤销
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     */
    public void undoButtonWasPushed(){
        undoCommand.undo();
    }
}
