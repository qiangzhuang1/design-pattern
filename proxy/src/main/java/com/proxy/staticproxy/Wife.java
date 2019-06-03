package com.proxy.staticproxy;


import com.proxy.Person;

public class Wife implements Person {
    private Husband person;

    //没办法扩展
    public Wife(Husband person){
        this.person = person;
    }

    @Override
    public void selectHouse() {
        System.out.println("妻子开始找房子");
        //目标对象的引用拿到
        person.selectHouse();
        System.out.println("丈夫极为满意妻子找的房子");
    }
}
