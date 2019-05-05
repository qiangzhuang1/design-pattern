package com.factory.abstractfactory;


public class HpComputerFactory implements IComputerAbstractFactory{

    @Override
    public IHpBuyComputer createBuyComputer() {
        return new HpBuyComputer();
    }

    @Override
    public IHpUseComputer createUseComputer() {
        return new HpUseComputer();
    }
}
