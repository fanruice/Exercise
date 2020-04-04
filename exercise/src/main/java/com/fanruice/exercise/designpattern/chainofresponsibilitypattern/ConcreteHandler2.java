package com.fanruice.exercise.designpattern.chainofresponsibilitypattern;

/**
 * 具体处理者2
 */
public class ConcreteHandler2 extends Handler {

    @Override
    public int getHandleLevel() {
        return 2;
    }

    @Override
    public TheResponse echo(TheRequest request) {
        TheResponse response = new TheResponse();
        response.setMsg("ConcreteHandler2进行处理！");
        return response;
    }
}
