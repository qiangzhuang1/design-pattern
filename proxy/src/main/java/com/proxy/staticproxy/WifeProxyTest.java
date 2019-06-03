package com.proxy.staticproxy;

public class WifeProxyTest {
    public static void main(String[] args) {
        //只能帮丈夫找房子，不能帮朋友，陌生人找房子
        Wife father = new Wife(new Husband());
        father.selectHouse();
    }
}
