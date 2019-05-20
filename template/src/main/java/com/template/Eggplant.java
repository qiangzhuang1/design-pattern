package com.template;

/**
 * 炒茄子
 */
public class Eggplant extends CookingTemplate{
    @Override
    protected boolean check() {
        return true;
    }
    @Override
    protected void oilDrain() {
        System.out.println("放油：放入花生油");
    }
    @Override
    protected void rawMaterial() {
        System.out.println("下原材料：茄子");
    }
    @Override
    protected void putCondiment() {
        System.out.println("调味品：香油，盐，鸡精");
    }
}