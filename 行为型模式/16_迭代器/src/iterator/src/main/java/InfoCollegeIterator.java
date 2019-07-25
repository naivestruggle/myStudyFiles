import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院  迭代器
 */
public class InfoCollegeIterator implements Iterator {
    /**
     * 信息工程学院是以List方式存放专业
     */
    List<Department> departmentList;

    /**
     * 索引
     */
    int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if(index >= departmentList.size() - 1){
            return false;
        }
        index ++;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }


    @Override
    public void remove() {

    }
}
