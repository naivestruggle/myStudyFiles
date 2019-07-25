package dynamic.jdk;

/**
 * @Author:
 * @Date:2019/7/18
 * @Description:dynamic.jdk
 * @Version:1.0
 */
public interface ITeacherDao {
    public void teach();

    /**
     * 作加法
     * @param a
     * @param b
     * @return
     */
    public int add(int a,int b);
}
