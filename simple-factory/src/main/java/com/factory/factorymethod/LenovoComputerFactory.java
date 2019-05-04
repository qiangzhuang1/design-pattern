package com.factory.factorymethod;

import com.factory.IComputer;
import com.factory.LenovoComputer;

public class LenovoComputerFactory implements IComputerFactory{
    @Override
    public IComputer create() {
        return new LenovoComputer();
    }
}
