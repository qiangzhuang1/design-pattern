package demo2;

public class CostDetailTest {
    public static void main(String[] args) {
        CostDetail costDetail;
        //基础费用
        costDetail = new BaseFee();
        //其他费用
        costDetail = new OtherFeeDecorator(costDetail);
        //等候费
        costDetail = new WaitingFeeDecorator(costDetail);
        System.out.println(costDetail.getMsg() + "，价格：" + costDetail.getPrice());
    }
}