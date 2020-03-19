package com.fanruice.exercise.designpattern.commandpattern;

/**
 * 关闭电灯命令
 */
public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
