package com.design.pattern;

/**
 * 具体的命令对象ConcreteCommand：持有具体的接受者对象，完成具体的具体的命令。
 * 开的命令
 */
public class LightOnCommand implements Command{
    private Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}