package com.fanruice.exercise.designpattern.bridgePattern;

/**
 * 公共的公司，可以生产任何产品
 */
public class CommonCorp extends Corp {

    public CommonCorp(Product product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱了！");
    }
}
