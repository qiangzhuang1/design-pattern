package com.command;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand on = new LightOnCommand(light);
        simpleRemoteControl.setCommand(on);
        simpleRemoteControl.buttonWasPressed();
        System.out.println("----------------------------------");
        LightOffCommand off = new LightOffCommand(light);
        simpleRemoteControl.setCommand(off);
        simpleRemoteControl.buttonWasPressed();
    }
}
