package com.iterator.V3;

import com.iterator.V2.DinerMenuV2;
import com.iterator.V2.PancakeMenuV2;
import com.iterator.V2.WaiterV2;

public class MenuTestV3 {
    public static void main(String[] args) {
        Menu dinerMenuV3 = new DinerMenuV3();
        Menu pancakeMenuV3 = new PancakeMenuV3();
        WaiterV3 waiterV3 = new WaiterV3(dinerMenuV3,pancakeMenuV3);
        waiterV3.printMenu();
    }
}