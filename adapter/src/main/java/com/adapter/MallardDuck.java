package com.adapter;

/**
 * 野鸭
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("呱呱的叫");
    }

    @Override
    public void fly() {
        System.out.println("我在飞");
    }
}
