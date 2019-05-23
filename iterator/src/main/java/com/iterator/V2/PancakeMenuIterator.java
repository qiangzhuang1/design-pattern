package com.iterator.V2;

import com.iterator.V1.MenuItem;

import java.util.ArrayList;

/**
 * 煎饼菜单迭代器
 */
public class PancakeMenuIterator implements Iterator {
    private ArrayList items;
    //记录当前数组遍历的位置
    int position = 0;

    public PancakeMenuIterator(ArrayList menuItems) {
        this.items = menuItems;
    }

    public PancakeMenuIterator() {
        items = new ArrayList();
        addItem("原味煎饼","原味煎饼的描述",false,8.8);
        addItem("双蛋王中王煎饼","双蛋王中王煎饼的描述",false,14.8);
        addItem("酱汁肉煎饼","酱汁肉煎饼的描述",true,16.8);
        addItem("培根双薄脆煎饼","培根双薄脆煎饼的描述",true,20.8);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name,description,vegetarian,price);
        items.add(menuItem);
    }

    @Override
    public boolean hasNext() {
        if(position >= items.size() || items == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = (MenuItem) items.get(position);
        position = position + 1;
        return item;
    }
}