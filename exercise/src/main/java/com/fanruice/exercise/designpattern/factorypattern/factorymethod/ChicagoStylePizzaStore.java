package com.fanruice.exercise.designpattern.factorypattern.factorymethod;

import com.fanruice.exercise.designpattern.factorypattern.simplefactory.Pizza;

/**
 * 芝加哥风味的披萨店
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    /**
     * 创建具体的芝加哥风味的披萨
     * @param type 类型
     * @return Pizza
     */
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;

        if ("cheese".equals(type)) {
            pizza = new ChicagoStyleCheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new ChicagoStyleGreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new ChicagoStylePepperoniPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
