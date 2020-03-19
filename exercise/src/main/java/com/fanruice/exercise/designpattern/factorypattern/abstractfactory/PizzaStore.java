package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;

/**
 * 披萨店 抽象类
 */
public abstract class PizzaStore {

    /**
     * 点披萨
     * @param type 类型
     * @return Pizza
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
        return null;
    }

    /**
     * 创建披萨 由子类决定创建什么Pizza
     * @param type 类型
     * @return Pizza
     */
    public abstract Pizza createPizza(String type);
}
