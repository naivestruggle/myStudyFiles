import java.util.HashMap;
import java.util.Map;

/**
 * 具体的中介者对象
 */
public class ConcreteMediator extends Mediator {
    /**
     * 集合，放入了所有的同事对象
     */
    private Map<String,Colleague> colleagueMap;
    private Map<String,String> interMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
        this.interMap = new HashMap<>();
    }

    /**
     * 将同事者对象，加入到集合中
     *
     * @param name      同事者对象名
     * @param colleague 同事者对象
     */
    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name,colleague);

        String key = "";
        if(colleague instanceof Alarm){
            key = "Alarm";
        }else if(colleague instanceof CoffeeMachine){
            key = "CoffeeMachine";
        }else if(colleague instanceof TV){
            key = "TV";
        }else if(colleague instanceof Curtains){
            key = "Curtains";
        }

        interMap.put(key,name);
    }

    /**
     * 接收消息，具体的同事对象发出
     *
     * 具体中介者的核心方法
     * 1、根据得到的消息，完成对应的任务
     * 2、中介者在这个方法，协调各个具体的同事对象，完成任务
     *
     * 这个方法中根据自己的业务需求写业务代码
     *
     * @param stateChange
     * @param name
     */
    @Override
    public void getMssage(int stateChange, String name) {
        //这里随便写几个业务逻辑作为示例
        Colleague colleague = colleagueMap.get(name);

        if(colleague instanceof Alarm){
            //闹钟发出的消息  在这里处理
            if(stateChange == 0){
                ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV)(colleagueMap.get(interMap.get("TV")))).startTv();
            }else if(stateChange == 1){
                ((TV)(colleagueMap.get(interMap.get("TV")))).stopTv();
            }
        }else if(colleague instanceof CoffeeMachine){
            //咖啡机发出的消息  在这里处理
            ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine")))).openCoffee();
        }else if(colleague instanceof TV){
            //电视机发出的消息  在这里处理
        }else if(colleague instanceof Curtains){
            //窗帘发出的消息  在这里处理
        }
    }

    @Override
    public void sendMessage() {

    }
}
