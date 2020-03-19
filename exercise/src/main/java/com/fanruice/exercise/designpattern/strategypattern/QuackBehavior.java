package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 呱呱叫行为接口
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 21:27
 */
public interface QuackBehavior {

    /**
     * 呱呱叫行为（每一个新的叫行为都必须实现quack方法）
     */
    void quack();
}
