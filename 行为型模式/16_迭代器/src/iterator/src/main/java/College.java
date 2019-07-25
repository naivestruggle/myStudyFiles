import java.util.Iterator;

/**
 * 学院接口
 */
public interface College {
    /**
     * 返回学院姓名
     * @return
     */
    public String getName();

    /**
     * 增加专业
     * @param name  专业名
     * @param desc  描述
     */
    public void addDepartment(String name,String desc);

    /**
     * 返回一个迭代器，遍历
     * @return  迭代器
     */
    public Iterator createIterator();
}
