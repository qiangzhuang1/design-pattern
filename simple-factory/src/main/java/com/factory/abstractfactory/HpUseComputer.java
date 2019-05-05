package com.factory.abstractfactory;

public class HpUseComputer implements IHpUseComputer{
    @Override
    public void useComputer() {
        System.out.println("使用惠普电脑");
    }
}
