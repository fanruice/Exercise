package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 不会叫类
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 21:32
 */
public class MuteQuack implements QuackBehavior {

    /**
     * 不会叫
     */
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
