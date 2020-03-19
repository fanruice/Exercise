package com.fanruice.exercise.designpattern.singletonpattern;

/**
 * 饿汉式
 */
public class SingletonOne {
    private static SingletonOne singletonOne = new SingletonOne();

    private SingletonOne() {}

    public static SingletonOne getInstance() {
        return singletonOne;
    }
}
