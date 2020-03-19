package com.fanruice.exercise.designpattern.templatepattern;

/**
 * 茶
 */
public class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("用沸水浸泡茶叶");
    }

    @Override
    void addCondiments() {
        System.out.println("在茶水中加柠檬");
    }
}
