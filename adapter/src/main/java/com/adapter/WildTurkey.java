package com.adapter;

/**
 * 野火鸡实现火鸡接口
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("我飞一段短距离的路");
    }
}
