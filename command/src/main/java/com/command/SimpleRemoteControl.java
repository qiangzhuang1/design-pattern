package com.command;

/**
 * 传递命令对象Invoker：持有命令对象，要求命令对象执行请求。
 */
public class SimpleRemoteControl {
    private Command command;
    public SimpleRemoteControl(){}
    public void setCommand(Command command) {
        this.command = command;
    }
    /**
     * 执行命令
     */
    public void buttonWasPressed() {
        command.execute();
    }
}