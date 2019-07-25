/**
 * @Author:
 * @Date:2019/7/23
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class TV extends Colleague {
    public TV(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象时，将自己放入到ConcreteMediator对象中【集合】
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用中介者的getMessage()方法
        this.getMediator().getMssage(stateChange,this.name);
    }

    public void startTv(){
        System.out.println("开启电视");
    }

    public void stopTv(){
        System.out.println("关闭电视");
    }
}
