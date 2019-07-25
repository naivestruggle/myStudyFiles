import java.util.Iterator;
import java.util.List;

/**
 * 输出实现
 */
public class OutputImpl {
    /**
     * 学院集合
     */
    private List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    /**
     * 遍历所有学院，然后调用printDepartment  输出各个学院的系
     */
    public void printCollege(){
        //从collegeList中取出所有的学院，Java中的List已经实现了Iterator
        Iterator<College> iterator = collegeList.iterator();
        while(iterator.hasNext()){
            //取出一个学院
            College college = iterator.next();
            System.out.println("============"+college.getName()+"=============");

            //得到各个学院对应的迭代器
            Iterator iterator1 = college.createIterator();

            //输出专业
            printDepartment(iterator1);
        }
    }

    /**
     * 输出   学院输出专业
     */
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
