package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 飞行为接口
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 21:22
 */
public interface FlyBehavior {

    /**
     * 飞（所有的新的飞行类都必须实现fly方法）
     */
    void fly();
}
