package com.fanruice.exercise.designpattern.singletonpattern;

/**
 * 懒汉式
 */
public class SingletonTwo {
    private static SingletonTwo singletonTwo;

    private SingletonTwo() {}

    public static SingletonTwo getInstance() {
        if (singletonTwo == null) {
            singletonTwo = new SingletonTwo();
        }
        return singletonTwo;
    }
}
