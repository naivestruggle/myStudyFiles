/**
 * 专业处理类
 */
public class DepartmentApprover extends Approver {


    public DepartmentApprover(String name) {
        super(name);
    }

    /**
     * 处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
     *
     * @param purchaseRequest
     */
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() <= 5000){
            System.out.println("请求编号id:"+purchaseRequest.getId()+"被"+getName()+" 处理");
        }else {
            getApprover().processRequest(purchaseRequest);
        }
    }
}
