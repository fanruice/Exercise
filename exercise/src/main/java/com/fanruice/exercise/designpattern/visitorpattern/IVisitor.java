package com.fanruice.exercise.designpattern.visitorpattern;

/**
 * 访问者接口
 */
public interface IVisitor {

    /**
     * 可以访问哪些对象
     */
    public void visit(ConcreteElement1 element1);

    public void visit(ConcreteElement2 element2);
}
