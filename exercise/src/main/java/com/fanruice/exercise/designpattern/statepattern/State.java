package com.fanruice.exercise.designpattern.statepattern;

/**
 * 状态接口
 */
public interface State {

    /**
     * 往糖果机中放入25美分
     */
    void insertQuarter();

    /**
     * 从糖果机中退回25美分
     */
    void ejectQuarter();

    /**
     * 转动糖果机的曲柄
     */
    void turnCrank();

    /**
     * 发放糖果
     */
    void dispense();
}
