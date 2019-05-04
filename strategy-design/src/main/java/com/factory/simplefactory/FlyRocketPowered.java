package com.factory.simplefactory;

//火箭助力的飞行行为
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.printf("我用火箭飞行");
    }
}
