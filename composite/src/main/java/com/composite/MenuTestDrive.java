package com.composite;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeMenu = new Menu("煎饼菜单","早餐");
        MenuComponent dinerMenu = new Menu("餐厅的菜单","午餐");
        MenuComponent cafeMenu = new Menu("咖啡馆菜单","晚餐");
        MenuComponent dessertMenu = new Menu("甜点菜单","午餐甜点");
        MenuComponent allMenus = new Menu("所有的菜单","所有菜单的总和");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("苹果沙拉","苹果沙拉描述",true,1.59));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}