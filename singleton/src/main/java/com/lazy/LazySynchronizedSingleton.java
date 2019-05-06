package com.lazy;

/**
 * 懒汉式单例 安全
 */
public class LazySynchronizedSingleton {
    private LazySynchronizedSingleton(){}
    private static LazySynchronizedSingleton lazy = null;
    public synchronized static LazySynchronizedSingleton getInstance(){
        if(lazy == null){
            lazy = new LazySynchronizedSingleton();
        }
        return lazy;
    }
}
