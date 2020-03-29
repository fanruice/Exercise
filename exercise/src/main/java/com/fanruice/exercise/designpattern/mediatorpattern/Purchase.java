package com.fanruice.exercise.designpattern.mediatorpattern;

/**
 * 采购类
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 采购电脑
     */
    public void buyComputer(int number) {
        mediator.execute("buy", number);
    }

    /**
     * 不再采购电脑
     */
    public void refuseBuyComputer() {
        System.out.println("不再采购电脑！");
    }
}
