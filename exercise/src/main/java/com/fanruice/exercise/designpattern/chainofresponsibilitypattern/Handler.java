package com.fanruice.exercise.designpattern.chainofresponsibilitypattern;

/**
 * 抽象处理者
 */
public abstract class Handler {

    private Handler nextHandler;

    /**
     * 处理级别
     */
    public abstract int getHandleLevel();

    /**
     * 子类自己处理业务
     * @param request
     * @return
     */
    public abstract TheResponse echo(TheRequest request);

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 对请求进行处理
     * @param request
     * @return
     */
    public final TheResponse handleMessage(TheRequest request) {
        TheResponse response = null;
        //如果是自己的处理等级，就自己处理
        if (this.getHandleLevel() == request.getLevel()) {
            response = this.echo(request);
        } else {
            //不属于自己的处理级别，有下一个处理者
            if (null != this.nextHandler) {
                response = this.nextHandler.handleMessage(request);
            } else {
                System.out.println("没有适当的处理者！");
            }
        }
        return response;
    }
}
