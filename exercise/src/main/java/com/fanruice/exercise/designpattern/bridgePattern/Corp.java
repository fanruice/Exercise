package com.fanruice.exercise.designpattern.bridgePattern;

/**
 * 抽象公司类
 */
public abstract class Corp {

    //公司是用来生产产品的，但是不知道具体的产品
    private Product product;

    //由子类来定义具体的产品
    public Corp(Product product) {
        this.product = product;
    }

    //公司是用来赚钱的
    public void makeMoney() {
        //先生产
        product.beProdected();
        //后销售
        product.beSelled();
    }
}
