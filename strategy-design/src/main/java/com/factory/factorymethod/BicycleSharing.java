package com.factory.factorymethod;

public class BicycleSharing {
    public String bicycle(String str){
        if("mobike".equals(str)){
            return "骑摩拜单车";
        }else if("ofo".equals(str)){
            return "骑行小黄车";
        }else if("bluegogo".equals(str)){
            return "骑小蓝单车";
        }
        return "没有车可骑行，走路吧！！！";
    }

    public static void main(String[] args) {
        BicycleSharing bicycleSharing = new BicycleSharing();
        System.out.println(bicycleSharing.bicycle("bluegogo"));

    }
}