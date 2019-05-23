package com.iterator.V3;

import com.iterator.V1.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 煎饼菜单迭代器
 */
public class PancakeMenuIteratorV3 implements Iterator {
    private ArrayList items;
    //记录当前数组遍历的位置
    int position = 0;

    public PancakeMenuIteratorV3(ArrayList menuItems) {
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