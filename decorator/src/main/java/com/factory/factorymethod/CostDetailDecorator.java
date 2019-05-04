package com.factory.factorymethod;

/**
 * 费用成本的装饰
 */
public abstract class CostDetailDecorator extends CostDetail{
    private CostDetail costDetail;

    public CostDetailDecorator(CostDetail costDetail){
        this.costDetail = costDetail;
    }

    @Override
    public String getMsg() {
        return this.costDetail.getMsg();
    }

    @Override
    public double getPrice() {
        return this.costDetail.getPrice();
    }
}