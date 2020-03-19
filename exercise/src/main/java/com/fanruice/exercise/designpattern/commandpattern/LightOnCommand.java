package com.fanruice.exercise.designpattern.commandpattern;

/**
 * 打开电灯类命令
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
