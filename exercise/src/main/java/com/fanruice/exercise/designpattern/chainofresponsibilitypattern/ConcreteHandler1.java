package com.fanruice.exercise.designpattern.chainofresponsibilitypattern;

/**
 * 具体处理者1
 */
public class ConcreteHandler1 extends Handler {

    @Override
    public int getHandleLevel() {
        return 1;
    }

    @Override
    public TheResponse echo(TheRequest request) {
        TheResponse response = new TheResponse();
        response.setMsg("ConcreteHandler1进行处理！");
        return response;
    }
}
