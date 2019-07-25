package staticProxy;

/**
 * 教师
 */
public class TeacherDao implements ITeacherDao {
    /**
     * 授课
     */
    @Override
    public void teach() {
        System.out.println("老师授课");
    }
}
