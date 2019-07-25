/**
 * @Author:
 * @Date:2019/7/17
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Main {
    public static void main(String[] args) {
        //从大到小创建对象

        //1、大学
        OrganizationComponent university = new University("清华大学", "中国顶级的大学");

        //2、学院
        OrganizationComponent college1 = new College("计算机学院","学习计算机相关知识的地方");
        OrganizationComponent college2 = new College("外国语学院","学习外语相关知识的地方");
        OrganizationComponent college3 = new College("经融管理学院","学习金融管理相关知识的地方");

        //3、部门
        OrganizationComponent department1 = new Department("软件工程","学习软件工程");
        OrganizationComponent department2 = new Department("网络工程","学习网络");
        OrganizationComponent department3 = new Department("英语专业","学习英语");
        OrganizationComponent department4 = new Department("法语专业","学习法语");
        OrganizationComponent department5 = new Department("会计专业","学习管账");


        //先将部门聚合到学院中
        college1.add(department1);
        college1.add(department2);

        college2.add(department3);
        college2.add(department4);

        college3.add(department5);


        //再将学院聚合到大学中
        university.add(college1);
        university.add(college2);
        university.add(college3);


        university.print();
    }
}
