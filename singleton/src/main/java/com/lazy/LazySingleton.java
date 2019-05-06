package com.lazy;

/**
 * 懒汉式单例 不安全
 */
public class LazySingleton {
    private LazySingleton(){}
    private static LazySingleton lazy = null;
    public static LazySingleton getInstance(){
        if(lazy == null){
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
