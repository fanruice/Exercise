package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;

/**
 * 纽约风味的披萨店
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory nyPizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza;
        if ("cheese".equals(type)) {
            pizza = new CheesePizza(nyPizzaIngredientFactory);
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza(nyPizzaIngredientFactory);
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(nyPizzaIngredientFactory);
        } else {
            return null;
        }
        return pizza;
    }
}
