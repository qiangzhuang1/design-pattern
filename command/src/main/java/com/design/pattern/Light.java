package com.design.pattern;

/**
 * 接受者对象Receiver：接受者对象，真正执行命令的对象。
 */
public class Light {
    /**
     * 开的法
     */
    public void lightOn() {
        System.out.println("打开空调！！");
    }

    /**
     * 关的法
     */
    public void lightOff() {
        System.out.println("关闭空调！！");
    }
}