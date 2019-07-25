/**
 * 校长处理类
 */
public class ShcoolMasterApprover extends Approver{
    public ShcoolMasterApprover(String name) {
        super(name);
    }

    /**
     * 处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
     *
     * @param purchaseRequest
     */
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        int price = purchaseRequest.getPrice();
        if(price > 30000){
            System.out.println("请求编号id:"+purchaseRequest.getId()+"被"+getName()+" 处理");
        }else {
            getApprover().processRequest(purchaseRequest);
        }
    }
}
