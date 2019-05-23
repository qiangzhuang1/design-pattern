package com.iterator.V2;

public class MenuTest {
    public static void main(String[] args) {
        PancakeMenuV2 pancakeMenuV2 = new PancakeMenuV2();
        DinerMenuV2 dinerMenuV2 = new DinerMenuV2();
        WaiterV2 waiterV2 = new WaiterV2(pancakeMenuV2,dinerMenuV2);
        waiterV2.printMenu();
    }
}