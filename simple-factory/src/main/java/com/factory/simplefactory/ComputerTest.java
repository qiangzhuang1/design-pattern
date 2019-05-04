package com.factory.simplefactory;

import com.factory.IComputer;

public class ComputerTest {
    public static void main(String[] args) {
        /*IComputer computer = new HpComputer();
        computer.buyComputer();*/
        ComputerFactory factory = new ComputerFactory();
        IComputer computer = factory.create("lenovo");
        computer.buyComputer();
    }
}
