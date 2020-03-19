package com.fanruice.exercise.designpattern.adapterpattern;

/**
 * 具体的火鸡类
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
