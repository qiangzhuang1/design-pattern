package com.factory.factorymethod;

public class BaseFee extends CostDetail{

    @Override
    public String getMsg() {
        return "基础价格";
    }

    @Override
    public double getPrice() {
        return 50.12;
    }
}