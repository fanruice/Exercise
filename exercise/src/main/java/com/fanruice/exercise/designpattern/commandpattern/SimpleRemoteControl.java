package com.fanruice.exercise.designpattern.commandpattern;

/**
 * 遥控器
 */
public class SimpleRemoteControl {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 按下按钮后，执行命令
     */
    public void buttonWasPressed() {
        command.execute();
    }
}
