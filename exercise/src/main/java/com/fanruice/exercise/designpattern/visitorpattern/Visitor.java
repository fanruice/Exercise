package com.fanruice.exercise.designpattern.visitorpattern;

/**
 * 具体的访问者
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(ConcreteElement1 element1) {
        System.out.println("元素名称：" + element1 + ",需要做：");
        element1.dosomething();
    }

    @Override
    public void visit(ConcreteElement2 element2) {
        System.out.println("元素名称：" + element2 + ",需要做：");
        element2.dosomething();
    }
}
