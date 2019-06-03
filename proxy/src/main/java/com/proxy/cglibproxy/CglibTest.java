package com.proxy.cglibproxy;

public class CglibTest {
    public static void main(String[] args) {
        try {
            Customer obj = (Customer) new CGlibIntermediary().getInstance(Customer.class);
            obj.selectHouse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
