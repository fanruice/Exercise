package com.fanruice.exercise.designpattern.factorypattern.factorymethod;

/**
 * 模拟顾客点单
 */
public class TestFactoryMethod {

    public static void main(String[] args) {
        PizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();
        //分别点纽约 芝加哥风味的cheese披萨
        nyStylePizzaStore.orderPizza("cheese");
        chicagoStylePizzaStore.orderPizza("cheese");
    }
}
