import java.util.Iterator;

/**
 * 计算机学院
 */
public class ComputerCollege implements College {

    private Department[] departments;
    /**
     * 保存当前数组的对象个数
     */
    int numOfDepartment = 0;


    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("JAVA专业"," JAVA专业");
        addDepartment("PHP专业"," PHP专业");
        addDepartment("JSP专业"," JSP专业");
        addDepartment("大数据专业"," 大数据专业");
    }

    /**
     * 返回学院姓名
     *
     * @return
     */
    @Override
    public String getName() {
        return "计算机学院";
    }

    /**
     * 增加专业
     *
     * @param name 专业名
     * @param desc 描述
     */
    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    /**
     * 返回一个迭代器，遍历
     *
     * @return 迭代器
     */
    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
