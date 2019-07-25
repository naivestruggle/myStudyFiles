package staticProxy;

/**
 * 代理教师
 */
public class TeacherDaoProxy implements ITeacherDao {

    private TeacherDao target;

    public TeacherDaoProxy(TeacherDao target) {
        this.target = target;
    }

    /**
     * 授课
     */
    @Override
    public void teach() {

        System.out.println("开始代理 完成某些操作");
        target.teach();
        System.out.println("代理结束");

    }
}
