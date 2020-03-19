package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;

/**
 * 芝加哥风味的披萨店
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        PizzaIngredientFactory chicagoPizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza(chicagoPizzaIngredientFactory);
        } else if ("greek".equals(type)) {
            pizza = new GreekPizza(chicagoPizzaIngredientFactory);
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza(chicagoPizzaIngredientFactory);
        } else {
            return null;
        }
        return pizza;
    }
}
