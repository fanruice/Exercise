package com.fanruice.exercise.designpattern.singletonpattern;

/**
 * 双重检查锁
 */
public class SingletonThree {

    private volatile static SingletonThree singletonThree;

    private SingletonThree() {}

    private static SingletonThree getInstance() {
        if (singletonThree == null) {
            synchronized (SingletonThree.class) {
                if (singletonThree == null) {
                    singletonThree = new SingletonThree();
                }
            }
        }
        return singletonThree;
    }
}
