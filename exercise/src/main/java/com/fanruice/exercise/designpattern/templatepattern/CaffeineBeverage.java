package com.fanruice.exercise.designpattern.templatepattern;

/**
 * 咖啡因饮料抽象类
 */
public abstract class CaffeineBeverage {

    /**
     * 准备配方
     */
    void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 把水煮沸
     */
    private void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * 把饮料倒进杯子
     */
    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * 冲泡
     */
    abstract void brew();

    /**
     * 加调料
     */
    abstract void addCondiments();
}
