package com.fanruice.exercise.designpattern.mediatorpattern;

import java.util.Random;

/**
 * 销售类
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 销售电脑
     */
    public void sellComputer(int number) {
        System.out.println("销售电脑：" + number + "台！");
        mediator.execute("sell", number);
    }

    /**
     * 反馈销售情况
     */
    public int getSaleStatus() {
        int i = new Random(System.currentTimeMillis()).nextInt(100);
        System.out.println("电脑的销售情况：" + i);
        return i;
    }
}
