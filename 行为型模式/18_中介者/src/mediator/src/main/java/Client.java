/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建了一个中介者对象
        Mediator mediator = new ConcreteMediator();

        //创建了一个闹钟，并且加入到了ConcreteMediator 对象的hashMap中
        Alarm alarm = new Alarm(mediator,"Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,"CoffeeMachine");
        Curtains curtains = new Curtains(mediator,"Curtains");
        TV tv = new TV(mediator,"TV");

        //闹钟发出消息
        alarm.sendAlarm(0);

        //咖啡机
        coffeeMachine.sendMessage(1);

        alarm.sendAlarm(1);
    }
}
