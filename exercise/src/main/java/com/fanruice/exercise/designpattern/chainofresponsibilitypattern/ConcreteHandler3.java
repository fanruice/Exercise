package com.fanruice.exercise.designpattern.chainofresponsibilitypattern;

/**
 * 具体处理者3
 */
public class ConcreteHandler3 extends Handler {

    @Override
    public int getHandleLevel() {
        return 3;
    }

    @Override
    public TheResponse echo(TheRequest request) {
        TheResponse response = new TheResponse();
        response.setMsg("ConcreteHandler3进行处理！");
        return response;
    }
}
