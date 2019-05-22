package com.command;

/**
 * 接受者对象Receiver：接受者对象，真正执行命令的对象。
 */
public class Light {
    /**
     * 开的法
     */
    public void on() {
        System.out.println("打开空调");
    }

    /**
     * 关的法
     */
    public void off() {
        System.out.println("关闭空调");
    }
}