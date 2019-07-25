/**
 * 咖啡机
 */
public class CoffeeMachine extends Colleague{
    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        //在创建Alarm同事对象时，将自己放入到ConcreteMediator对象中【集合】
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        //调用中介者的getMessage()方法
        this.getMediator().getMssage(stateChange,this.name);
    }

    public void startCoffee(){
        System.out.println("开始制作咖啡");
    }

    public void openCoffee(){
        System.out.println("咖啡煮好了");
    }
}
