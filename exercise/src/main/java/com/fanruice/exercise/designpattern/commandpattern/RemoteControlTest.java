package com.fanruice.exercise.designpattern.commandpattern;

/**
 * 测试命令模式（客户）
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        Light light = new Light("卧室");
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOn);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.setCommand(lightOff);
        simpleRemoteControl.buttonWasPressed();
    }
}
