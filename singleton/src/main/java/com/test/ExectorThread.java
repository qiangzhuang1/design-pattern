package com.test;

import com.hungry.HungrySingleton;
import com.hungry.HungryStaticSingleton;
import com.lazy.LazySingleton;
import com.lazy.LazySynchronizedSingleton;

public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazySynchronizedSingleton singleton = LazySynchronizedSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + singleton);
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}