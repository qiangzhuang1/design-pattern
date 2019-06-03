package com.proxy.staticproxy;

import com.proxy.Person;

public class Husband implements Person {
    //丈夫由于工作太忙，让妻子代替自己找房子
    @Override
    public void selectHouse() {
        System.out.println("丈夫要求房间为三室一厅");
    }
}
