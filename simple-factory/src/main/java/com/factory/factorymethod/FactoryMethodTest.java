package com.factory.factorymethod;


import com.factory.IComputer;

public class FactoryMethodTest {
    public static void main(String[] args) {
        IComputerFactory factory = new LenovoComputerFactory();
        IComputer computer = factory.create();
        computer.buyComputer();

        factory = new HpComputerFactory();
        computer = factory.create();
        computer.buyComputer();

    }
}
