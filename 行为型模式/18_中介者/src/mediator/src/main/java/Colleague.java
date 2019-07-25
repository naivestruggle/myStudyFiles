/**
 * 同事抽象类
 */
public abstract class Colleague {
    /**
     * 中介者
     */
    private Mediator mediator;
    /**
     * 名字
     */
    public String name;


    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator(){
        return this.mediator;
    }

    public abstract void sendMessage(int stateChange);
}
