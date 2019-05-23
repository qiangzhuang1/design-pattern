package com.iterator.V1;

import java.util.ArrayList;

/**
 * 服务员
 */
public class WaiterTest {
    public static void main(String[] args) {
        PancakeMenu pancakeMenu = new PancakeMenu();
        ArrayList pancakeMenuItems = pancakeMenu.getMenuItems();
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem [] dinerMenuMenuItems= dinerMenu.getMenuItems();
        //煎饼菜单
        for (int i = 0; i < pancakeMenuItems.size(); i++) {
            MenuItem menuItem = (MenuItem) pancakeMenuItems.get(i);
            System.out.println(menuItem.getName()+"---"+menuItem.getDescription()+"---"+menuItem.isVegetarian()+"---"+menuItem.getPrice());
        }
        //餐厅菜单
        for (int i = 0; i < dinerMenuMenuItems.length; i++) {
            MenuItem dinerMenuMenuItem = dinerMenuMenuItems[i];
            if(dinerMenuMenuItem != null){
                System.out.println(dinerMenuMenuItem.getName()+"---"+dinerMenuMenuItem.getDescription()+"---"+dinerMenuMenuItem.isVegetarian()+"---"+dinerMenuMenuItem.getPrice());
            }
        }

    }
}