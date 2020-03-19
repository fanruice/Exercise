package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 不会飞 类
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 21:26
 */
public class FlyNoWay implements FlyBehavior {

    /**
     * 不会飞
     */
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
