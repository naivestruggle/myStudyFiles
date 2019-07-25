package dynamic.jdk;

/**
 * @Author:
 * @Date:2019/7/18
 * @Description:dynamic.jdk
 * @Version:1.0
 */
public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("老师正在授课中");
    }

    /**
     * 作加法
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public int add(int a, int b) {
        System.out.println(a+"+"+b);
        return a+b;
    }
}
