import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 信息工程学院
 */
public class InfoCollege implements College {
    List<Department> departmentList;

    public InfoCollege() {
        departmentList = new ArrayList<>();
        addDepartment("信息安全专业","  信息安全专业");
        addDepartment("网络安全专业","  网络安全专业");
    }

    /**
     * 返回学院姓名
     *
     * @return
     */
    @Override
    public String getName() {
        return "信息工程学院";
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
        departmentList.add(department);
    }

    /**
     * 返回一个迭代器，遍历
     *
     * @return 迭代器
     */
    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departmentList);
    }
}
