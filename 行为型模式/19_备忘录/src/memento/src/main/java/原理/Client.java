package 原理;

/**
 * @Author:
 * @Date:2019/7/23
 * @Description:原理
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态1：活着");
        //保存了当前的状态
        Memento memento1 = originator.saveStateMemento();
        //将当前状态保存到集合中
        caretaker.add(memento1);
        System.out.println("1、"+originator.getState());


        originator.setState("状态2：死了");
        Memento memento2 = originator.saveStateMemento();
        caretaker.add(memento2);
        System.out.println("2、"+originator.getState());

        originator.setState("状态3：复活");
        Memento memento3 = originator.saveStateMemento();
        caretaker.add(memento3);
        System.out.println("3、"+originator.getState());


        //恢复到状态1
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("4、"+originator.getState());

    }
}
