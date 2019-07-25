/**
 * 处理类（抽象）
 */
public abstract class Approver {
    /**
     * 下一个处理者
     */
    private Approver approver;

    private String name;

    public Approver(String name) {
        this.name = name;
    }

    /**
     * 传入下一个处理者
     * @param approver
     */
    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    /**
     * 处理审批请求的方法，得到一个请求，处理是子类完成，因此该方法做成抽象
     */
    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public String getName() {
        return name;
    }

    public Approver getApprover() {
        return approver;
    }
}
