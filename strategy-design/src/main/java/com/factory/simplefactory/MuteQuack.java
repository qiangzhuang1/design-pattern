package com.factory.simplefactory;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("不会叫");
    }
}
