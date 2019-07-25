/**
 * 中介者
 */
public abstract class Mediator {

    /**
     * 将同事者对象，加入到集合中
     * @param name  同事者对象名
     * @param colleague 同事者对象
     */
    public abstract void register(String name, Colleague colleague);

    /**
     * 接收消息，具体的同事对象发出
     * @param stateChange
     * @param name
     */
    public abstract void getMssage(int stateChange, String name);

    public abstract void sendMessage();
}
