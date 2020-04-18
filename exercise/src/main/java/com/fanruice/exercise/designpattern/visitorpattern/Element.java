package com.fanruice.exercise.designpattern.visitorpattern;

/**
 * 抽象元素
 */
public abstract class Element {

    /**
     * 定义业务逻辑
     */
    public abstract void dosomething();

    /**
     * 允许谁来访问
     */
    public abstract void accept(IVisitor visitor);
}
