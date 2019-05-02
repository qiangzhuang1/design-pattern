package demo2;

/**
 * 等待费
 */
public class WaitingFeeDecorator extends CostDetailDecorator{
    public WaitingFeeDecorator(CostDetail costDetail){
        super(costDetail);
    }
    @Override
    public String getMsg() {
        return super.getMsg() + ",等待费";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 66;
    }
}