import java.util.ArrayList;
import java.util.List;

/**
 * 学院
 */
public class College extends OrganizationComponent {
    //存放的是专业
    List<OrganizationComponent> organizationComponentList =
            new ArrayList<>();

    //构造器
    public College(String name, String des) {
        super(name, des);
    }

    @Override
    public void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    public void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }



    /**
     * 打印  学院中所有的专业
     */
    @Override
    public void print() {
        System.out.println("\t"+getName());
        for (OrganizationComponent organizationComponent : organizationComponentList){
            organizationComponent.print();
        }
    }
}
