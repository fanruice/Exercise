package com.fanruice.exercise.designpattern.commandpattern;

/**
 * @description 电灯
 *
 * @date   2019/10/29 17:13
 */
public class Light {
    private String name;

    public Light(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " light is on!");
    }

    public void off() {
        System.out.println(name + " light is off!");
    }
}
