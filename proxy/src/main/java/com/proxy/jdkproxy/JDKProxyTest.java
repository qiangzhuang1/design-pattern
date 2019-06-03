package com.proxy.jdkproxy;

import java.lang.reflect.Method;

public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Object obj = new JDKIntermediary().getInstance(new Customer());
            Method method = obj.getClass().getMethod("selectHouse",null);
            method.invoke(obj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
