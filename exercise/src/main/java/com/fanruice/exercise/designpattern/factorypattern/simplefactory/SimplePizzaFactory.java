package com.fanruice.exercise.designpattern.factorypattern.simplefactory;

/**
 * 简单披萨工厂类
 */
public class SimplePizzaFactory {

    /**
     * 创建披萨
     * @param type 类型
     * @return Pizza
     */
    public Pizza createPizza(String type) {
        Pizza pizza;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else {
            return null;
        }
        return pizza;
    }
}
