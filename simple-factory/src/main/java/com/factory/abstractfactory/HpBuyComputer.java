package com.factory.abstractfactory;

public class HpBuyComputer implements IHpBuyComputer{
    @Override
    public void buyComputer() {
        System.out.println("购买惠普电脑");
    }
}
