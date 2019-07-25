package staticProxy;

/**
 * @Author:
 * @Date:2019/7/18
 * @Description:staticProxy
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
