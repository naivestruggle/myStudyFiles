/**
 * @Author:
 * @Date:2019/7/17
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public abstract class OrganizationComponent {
    private String name;
    //描述
    private String des;

    public void add(OrganizationComponent organizationComponent){
        //默认实现   抛出不支持操作异常
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationComponent organizationComponent){
        //默认实现   抛出不支持操作异常
        throw new UnsupportedOperationException();
    }

    /**
     * 打印
     */
    public abstract void print();

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }


}
