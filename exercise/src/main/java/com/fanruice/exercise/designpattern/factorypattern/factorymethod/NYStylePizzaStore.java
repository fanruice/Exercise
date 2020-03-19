package com.fanruice.exercise.designpattern.factorypattern.factorymethod;

import com.fanruice.exercise.designpattern.factorypattern.simplefactory.Pizza;

/**
 * 纽约风味的披萨店
 */
public class NYStylePizzaStore extends PizzaStore {

    /**
     * 创建具体的纽约风味的披萨
     *
     * @param type 类型
     * @return Pizza
     */
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        if ("cheese".equals(type)) {
            pizza = new NYStyleCheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new NYStyleGreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new NYStylePepperoniPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
