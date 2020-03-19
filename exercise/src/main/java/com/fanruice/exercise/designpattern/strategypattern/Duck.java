package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 鸭子基类
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 20:12
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    /**
     * 游泳行为（所有鸭子都会）
     */
    public void swim() {
        System.out.println("游泳");
    }

    /**
     * 每个鸭子额外观都不同  所以display是抽象方法
     */
    public abstract void display();

    /**
     * 飞行为
     */
    public void performFly() {
        flyBehavior.fly();
    }

    /**
     * 呱呱叫行为
     */
    public void performQuack() {
        quackBehavior.quack();
    }

    /**
     * 设置飞行为
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 设置叫行为
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
