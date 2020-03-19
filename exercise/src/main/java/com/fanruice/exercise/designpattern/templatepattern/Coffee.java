package com.fanruice.exercise.designpattern.templatepattern;

/**
 * 咖啡
 */
public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("用沸水冲泡咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("在咖啡中添加糖和牛奶");
    }
}
