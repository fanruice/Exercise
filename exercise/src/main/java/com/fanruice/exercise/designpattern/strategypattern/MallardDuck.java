package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 绿头鸭子类
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 20:19
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    /**
     *头是绿色的
     */
    @Override
    public void display() {
        System.out.println("外观是绿头的鸭子");
    }
}
