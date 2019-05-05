package com.factory.abstractfactory;


public class AbstractFactoryTest {
    public static void main(String[] args) {
        HpComputerFactory factory = new HpComputerFactory();
        factory.createBuyComputer().buyComputer();
        factory.createUseComputer().useComputer();
    }
}
