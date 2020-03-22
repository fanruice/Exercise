package com.fanruice.exercise.designpattern.bridgePattern;

/**
 * 衣服（具体的一种产品）
 */
public class Clothes extends Product {

    @Override
    public void beProdected() {
        System.out.println("生产衣服！");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的衣服被卖出去了！");
    }
}
