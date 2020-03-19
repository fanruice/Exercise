package com.fanruice.exercise.designpattern.prototypepattern;

import java.io.Serializable;

/**
 * 绵羊
 */
public class Sheep implements Cloneable, Serializable {

    private String name;
    private int age;
    private String color;
    private String address = "蒙古";

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        System.out.println("执行构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" + "name='" + name + '\'' + ", age=" + age + ", color='" + color + '\''
                + ", address='" + address + '\'' + '}';
    }

    /**
     * 克隆该实例，使用默认的clone方法来完成
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Sheep clone() {
        Sheep object = null;
        try {
            object = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("clone异常：" + e);
        }
        return object;
    }
}
