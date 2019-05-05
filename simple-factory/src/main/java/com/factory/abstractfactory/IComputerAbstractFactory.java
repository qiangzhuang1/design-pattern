package com.factory.abstractfactory;

/**
 * 抽象工厂是用户的主入口
 */
public interface IComputerAbstractFactory {
    IHpBuyComputer createBuyComputer();

    IHpUseComputer createUseComputer();
}
