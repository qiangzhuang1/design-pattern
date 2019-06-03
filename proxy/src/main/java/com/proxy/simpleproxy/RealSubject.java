package com.proxy.simpleproxy;

public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("调用真实对象（被代理对象）");
    }
}
