import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理了很多的人
 */
public class ObjectStructure {
    /**
     * 维护了一个集合
     */
    private List<Person> personList = new LinkedList<>();

    /**
     * 增加
     */
    public void attach(Person person){
        personList.add(person);
    }

    /**
     * 移除
     */
    public void detach(Person person){
        personList.remove(person);
    }

    /**
     * 显示测评情况
     */
    public void display(Action action){
        for(Person person : personList){
            person.accept(action);
        }
    }
}
