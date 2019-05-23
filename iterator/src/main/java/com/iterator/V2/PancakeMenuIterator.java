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