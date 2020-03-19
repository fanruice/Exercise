package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 红头鸭子类
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 20:22
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    /**
     * 外观是红头
     */
    @Override
    public void display() {
        System.out.println("外观是红头的鸭子");
    }
}
