package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;

/**
 * 纽约风味的原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String create() {
        return "nyStyle";
    }
}
