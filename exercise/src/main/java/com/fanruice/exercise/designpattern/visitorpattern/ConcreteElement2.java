package com.fanruice.exercise.designpattern.visitorpattern;

/**
 * 具体元素2
 */
public class ConcreteElement2 extends Element {

    @Override
    public void dosomething() {
        System.out.println("ConcreteElement2进行业务处理！");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
