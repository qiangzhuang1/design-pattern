package com.iterator.V3;

import com.iterator.V1.MenuItem;
import com.iterator.V2.PancakeMenuIterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼菜单
 */
public class PancakeMenuV3 implements Menu{
    private ArrayList menuItems;

    public PancakeMenuV3() {
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

    @Override
    public Iterator createIterator(){
        return menuItems.iterator();
    }
}