import java.util.ArrayList;
import java.util.List;

/**
 * 大学
 */
public class University extends OrganizationComponent {
    //存放的是学院
    List<OrganizationComponent> organizationComponentList =
            new ArrayList<>();

    //构造器
    public University(String name, String des) {
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
     * 打印  大学包含的所有学院
     */
    @Override
    public void print() {
        System.out.println(getName());
        for (OrganizationComponent organizationComponent : organizationComponentList){
            organizationComponent.print();
        }
    }
}
