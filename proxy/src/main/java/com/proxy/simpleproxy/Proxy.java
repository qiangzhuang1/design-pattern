package com.proxy.simpleproxy;

public class Proxy implements Subject{
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before(){
        System.out.println("调用方法之前");
    }

    public void after(){
        System.out.println("调用方法之后");
    }

}
