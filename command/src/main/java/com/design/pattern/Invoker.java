package com.design.pattern;

/**
 * 传递命令对象Invoker：持有命令对象，要求命令对象执行请求。
 */
public class Invoker {
    private Command command;

    /**
     * 设置具体的命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void doCommand() {
        command.execute();
    }
}