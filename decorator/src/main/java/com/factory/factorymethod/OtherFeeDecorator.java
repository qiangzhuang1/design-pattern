package com.factory.factorymethod;

/**
 * 其他费用
 */
public class OtherFeeDecorator extends CostDetailDecorator{

    public OtherFeeDecorator(CostDetail costDetail){
        super(costDetail);
    }

    @Override
    public String getMsg() {
        return super.getMsg() + ",其他费用";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 20;
    }
}