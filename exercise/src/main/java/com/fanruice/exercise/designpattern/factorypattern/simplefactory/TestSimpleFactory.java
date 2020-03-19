package com.fanruice.exercise.designpattern.factorypattern.simplefactory;

/**
 * 模拟顾客点单
 */
public class TestSimpleFactory {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        pizzaStore.orderPizza("cheese");
    }
}
