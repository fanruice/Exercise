package com.fanruice.exercise.designpattern.strategypattern;

/**
 * @description 吱吱叫类
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/8/18 21:31
 */
public class Squeak implements QuackBehavior {

    /**
     * 吱吱叫
     */
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
