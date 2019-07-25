/**
 * 窗帘
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象时，将自己放入到ConcreteMediator对象中【集合】
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用中介者的getMessage()方法
        this.getMediator().getMssage(stateChange,this.name);
    }

    public void upCurtains(){
        System.out.println("窗帘拉下来");
    }
}
