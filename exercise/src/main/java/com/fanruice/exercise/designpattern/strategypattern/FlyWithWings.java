package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 用翅膀飞类
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 21:25
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("用翅膀来飞行");
    }
}
