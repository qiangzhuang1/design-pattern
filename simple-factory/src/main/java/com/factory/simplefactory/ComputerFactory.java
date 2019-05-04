package com.factory.simplefactory;

import com.factory.HpComputer;
import com.factory.IComputer;
import com.factory.LenovoComputer;

public class ComputerFactory {
    public IComputer create(String name) {
        if ("hp".equals(name)) {
            return new HpComputer();
        } else if ("lenovo".equals(name)) {
            return new LenovoComputer();
        } else {
            return null;
        }
    }
}
