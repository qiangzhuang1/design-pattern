package com.proxy.jdkproxy;


import com.proxy.Person;

public class Customer implements Person {
    @Override
    public void selectHouse() {
        System.out.println("三室一厅，家电集全的房子");
    }
}
