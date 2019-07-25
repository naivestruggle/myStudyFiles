package command;

import command.improve.TvOffCommand;
import command.improve.TvOnCommand;
import command.improve.TvReceiver;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //使用命令设计模式完成通过遥控器对电灯的操作

        //创建电灯的对象（接受者）
        LightReceiver lightReceiver = new LightReceiver();

        //扩展：创建电视机的对象（接受者）
        TvReceiver tvReceiver = new TvReceiver();

        //创建电灯相关的开关命令
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommond lightOffCommond = new LightOffCommond(lightReceiver);

        //扩展：创建电视机的开关命令
        TvOnCommand tvOnCommand = new TvOnCommand(tvReceiver);
        TvOffCommand tvOffCommand = new TvOffCommand(tvReceiver);

        //需要一个遥控器
        RemoteController remoteController = new RemoteController();

        //给我们的遥控器设置命令，比如 no = 0 是电灯的开和关的操作
        remoteController.setCommand(0,lightOnCommand,lightOffCommond);
        remoteController.setCommand(1,tvOnCommand,tvOffCommand);

        System.out.println("-----------按下电灯的开的按钮--------------");
        remoteController.onButtonWasPushed(0);

        System.out.println("-----------按下电灯的关的按钮--------------");
        remoteController.offButtonWasPushed(0);

        System.out.println("-----------按下撤销按钮--------------");
        remoteController.undoButtonWasPushed();

        System.out.println("======================================================");

        System.out.println("-----------按下电视机的开的按钮--------------");
        remoteController.onButtonWasPushed(1);

        System.out.println("-----------按下电视机的关的按钮--------------");
        remoteController.offButtonWasPushed(1);

        System.out.println("-----------按下撤销按钮--------------");
        remoteController.undoButtonWasPushed();
    }
}
