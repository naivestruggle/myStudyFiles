package 原理;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录集合
 */
public class Caretaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    /**
     * 获取到第index个Originator的备忘录对象（即保存状态）
     * @param index
     * @return
     */
    public Memento get(int index){
        return mementoList.get(index);
    }
}
