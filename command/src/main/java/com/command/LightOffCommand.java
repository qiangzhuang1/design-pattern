package com.command;

/**
 * 具体的命令对象ConcreteCommand：持有具体的接受者对象，完成具体的具体的命令。
 * 关的命令
 */
public class LightOffCommand implements Command{
    private Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }
}