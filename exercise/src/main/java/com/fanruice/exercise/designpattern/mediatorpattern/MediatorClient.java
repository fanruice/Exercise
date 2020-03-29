package com.fanruice.exercise.designpattern.mediatorpattern;

/**
 * 客户端
 */
public class MediatorClient {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        //采购电脑
        new Purchase(mediator).buyComputer(100);
        //销售电脑
        new Sale(mediator).sellComputer(1);
        //清仓处理
        new Stock(mediator).clearStock();
    }
}
