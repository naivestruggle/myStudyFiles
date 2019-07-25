import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 计算机学院 迭代器
 */
public class ComputerCollegeIterator implements Iterator {

    /**
     * 这里我们需要知道Department 是以怎样的方式存放的
     */
    Department[] departments;
    /**
     * 遍历的位置
     */
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() throws NoSuchElementException {
        Department department = departments[position];
        position++;
        return department;
    }


    /**
     * 删除的方法现在不需要   默认空实现
     */
    @Override
    public void remove() {

    }
}
