package com.fanruice.exercise.designpattern.bridgePattern;

/**
 * 房子（具体的产品）
 */
public class House extends Product {

    @Override
    public void beProdected() {
        System.out.println("生产房子");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子被卖出去了！");
    }
}
