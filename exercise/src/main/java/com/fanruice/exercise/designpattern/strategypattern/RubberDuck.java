package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 橡皮鸭子（不会飞，会吱吱叫）
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 20:47
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("橡皮鸭子");
    }

}
