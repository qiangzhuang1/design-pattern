package com.iterator.V2;

import com.iterator.V1.MenuItem;

/**
 * 餐厅菜单迭代器
 */
public class DinerMenuIterator implements Iterator{
    MenuItem[] items;
    //记录当前数组遍历的位置
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position = position + 1;
        return item;
    }
}