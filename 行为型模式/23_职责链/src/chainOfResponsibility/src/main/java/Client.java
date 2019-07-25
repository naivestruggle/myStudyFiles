/**
 * @Author:
 * @Date:2019/7/25
 * @Description:PACKAGE_NAME
 * @Version:1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(0,10000);

        //创建审批人
        DepartmentApprover departmentApprover = new DepartmentApprover("主任");
        CollegeApprover collegeApprover = new CollegeApprover("院长");
        ViceShcoolMasterApprover viceShcoolMasterApprover = new ViceShcoolMasterApprover("副校长");
        ShcoolMasterApprover shcoolMasterApprover = new ShcoolMasterApprover("校长");

        //将审批人连起来   处理人构成环装
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceShcoolMasterApprover);
        viceShcoolMasterApprover.setApprover(shcoolMasterApprover);
        shcoolMasterApprover.setApprover(departmentApprover);

        //处理请求
        departmentApprover.processRequest(purchaseRequest);
    }
}
