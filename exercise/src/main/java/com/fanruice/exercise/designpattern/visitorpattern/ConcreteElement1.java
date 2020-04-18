package com.fanruice.exercise.designpattern.visitorpattern;

/**
 * 具体元素1
 */
public class ConcreteElement1 extends Element {

    @Override
    public void dosomething() {
        System.out.println("ConcreteElement1进行业务处理！");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
