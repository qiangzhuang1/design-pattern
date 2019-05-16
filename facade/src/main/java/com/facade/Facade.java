package com.facade;

public class Facade {
    public void test(){
        MethodA methodA = new MethodA();
        methodA.testA();
        MethodB methodB = new MethodB();
        methodB.testB();
        MethodC methodC = new MethodC();
        methodC.testC();
    }
}
