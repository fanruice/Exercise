package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 呱呱叫类
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 21:29
 */
public class Quack implements QuackBehavior {

    /**
     * 呱呱叫
     */
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
