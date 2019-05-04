package com.factory.factorymethod;

import com.factory.HpComputer;
import com.factory.IComputer;

public class HpComputerFactory implements IComputerFactory{
    @Override
    public IComputer create() {
        return new HpComputer();
    }
}
