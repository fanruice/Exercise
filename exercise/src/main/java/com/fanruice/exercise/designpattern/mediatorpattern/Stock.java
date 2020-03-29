package com.fanruice.exercise.designpattern.mediatorpattern;

/**
 * 库存管理类
 */
public class Stock extends AbstractColleague {

    private static int COMPUTER_NUMBER = 100; //电脑数量初始化100台

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 增加库存
     */
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    /**
     * 降低库存
     */
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为：" + COMPUTER_NUMBER);
    }

    public int getComputerNumber() {
        return COMPUTER_NUMBER;
    }

    /**
     * 库存压力大了，通知采购人员不要采购，销售人员尽快销售
     */
    public void clearStock() {
        System.out.println("清理库存适量为：" + COMPUTER_NUMBER);
        mediator.execute("clear");
    }
}
