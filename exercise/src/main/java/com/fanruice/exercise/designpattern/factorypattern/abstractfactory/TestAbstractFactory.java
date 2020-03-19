package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;

/**
 * 模拟顾客点单
 */
public class TestAbstractFactory {

    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        nyStylePizzaStore.orderPizza("cheese");
    }
}
