package com.fanruice.exercise.designpattern.mediatorpattern;

/**
 * 具体的中介者
 */
public class Mediator extends AbstractMediator {

    @Override
    public void execute(String str, Object... objects) {
        if ("buy".equals(str)) {
            buyComputer((Integer) objects[0]);
        } else if ("sell".equals(str)) {
            sellComputer((Integer) objects[0]);
        } else if ("clear".equals(str)) {
            clearStock();
        }
    }

    //采购电脑
    private void buyComputer(int number) {
        if (sale.getSaleStatus() > 80) {
            //销售情况不错
            System.out.println("采购电脑：" + number + "台！");
            stock.increase(number);
        } else {
            //销售情况不好
            int num = number / 2;
            System.out.println("采购电脑：" + num + "台！");
            stock.increase(num);
        }
    }

    /**
     * 销售电脑
     */
    private void sellComputer(int number) {
        if (stock.getComputerNumber() < number) {
            purchase.buyComputer(number);
        }
        stock.decrease(number);
    }

    /**
     * 清仓销售(销量不好，清仓处理，不再采购)
     */
    private void clearStock() {
        System.out.println("打折销售电脑：" + stock.getComputerNumber() + "台！");
        stock.decrease(stock.getComputerNumber());
        purchase.refuseBuyComputer();
    }


}
