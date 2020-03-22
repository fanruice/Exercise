package com.fanruice.exercise.designpattern.bridgePattern;

/**
 * ipad（具体的产品）
 */
public class Ipad extends Product {

    @Override
    public void beProdected() {
        System.out.println("生产ipad");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的ipad被卖出去了！");
    }
}
