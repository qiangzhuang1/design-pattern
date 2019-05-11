package com.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        //创建一只鸭子
        MallardDuck duck = new MallardDuck();
        //创建一只火鸡
        WildTurkey wildTurkey = new WildTurkey();
        //将火鸡包装进一个火鸡适配器中，使它看起来像是一只鸭子
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        //现测试火鸡在测试鸭子，然后在测试一个假装是鸭子的火鸡
        wildTurkey.gobble();
        wildTurkey.fly();
        System.out.println("------------------");
        testDuck(duck);
        System.out.println("------------------");
        testDuck(turkeyAdapter);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
