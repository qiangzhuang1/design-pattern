package com.iterator.V2;

import com.iterator.V1.DinerMenu;
import com.iterator.V1.MenuItem;
import com.iterator.V1.PancakeMenu;

import java.util.ArrayList;

/**
 * 服务员
 */
public class WaiterV2 {
    private PancakeMenuV2 pancakeMenuV2;
    private DinerMenuV2 dinerMenuV2;

    public WaiterV2(PancakeMenuV2 pancakeMenuV2, DinerMenuV2 dinerMenuV2) {
        this.pancakeMenuV2 = pancakeMenuV2;
        this.dinerMenuV2 = dinerMenuV2;
    }
    public void printMenu() {
        Iterator pancakeIterator = pancakeMenuV2.createIterator();
        Iterator dinerIterator = dinerMenuV2.createIterator();
        System.out.println("-----输出煎饼菜单-----");
        printMenu(pancakeIterator);
        System.out.println("-----输出餐厅菜单-----");
        printMenu(dinerIterator);
    }
    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName()+"，"+menuItem.getPrice()+"，"+menuItem.getDescription());
        }
    }
}