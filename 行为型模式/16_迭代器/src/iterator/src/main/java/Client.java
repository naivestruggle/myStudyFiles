import java.util.ArrayList;
import java.util.List;

/**
 * @Author:
 * @Date:2019/7/23
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutputImpl output = new OutputImpl(collegeList);
        output.printCollege();
    }
}
