package com.iterator.V1;

import java.util.ArrayList;

/**
 * 煎饼菜单
 */
public class PancakeMenu {
    private ArrayList menuItems;

    public PancakeMenu() {
        menuItems = new ArrayList();
        addItem("原味煎饼","原味煎饼的描述",false,8.8);
        addItem("双蛋王中王煎饼","双蛋王中王煎饼的描述",false,14.8);
        addItem("酱汁肉煎饼","酱汁肉煎饼的描述",true,16.8);
        addItem("培根双薄脆煎饼","培根双薄脆煎饼的描述",true,20.8);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        menuItems.add(menuItem);
    }
    public ArrayList getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList menuItems) {
        this.menuItems = menuItems;
    }
}