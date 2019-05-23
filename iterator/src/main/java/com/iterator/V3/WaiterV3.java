package com.iterator.V3;

import com.iterator.V1.MenuItem;

import java.util.Iterator;

/**
 * 服务员
 */
public class WaiterV3 {
    private Menu pancakeMenu;
    private Menu dinerMenu;

    public WaiterV3(Menu pancakeMenu, Menu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }
    public void printMenu() {
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
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