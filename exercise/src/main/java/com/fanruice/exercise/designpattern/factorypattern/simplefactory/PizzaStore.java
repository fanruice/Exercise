package com.fanruice.exercise.designpattern.factorypattern.simplefactory;

/**
 * 披萨店类
 */
public class PizzaStore {
    SimplePizzaFactory pizzaFactory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    /**
     * 点披萨
     *
     * @param type 类型
     * @return Pizza 披萨
     */
    Pizza orderPizza(String type) {
        /*Pizza pizza;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else {
            return null;
        }*/

        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
