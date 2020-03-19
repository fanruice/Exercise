package com.fanruice.exercise.designpattern.singletonpattern;

/**
 * 静态内部类
 */
public class SingletonFour {
    private SingletonFour() {}

    public static SingletonFour getInstance() {
        return Inner.singletonFour;
    }

    private static class Inner {
        private static final SingletonFour singletonFour = new SingletonFour();
    }
}
