package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;

/**
 * 芝加哥风味的原料工厂
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String create() {
        return "chicagoStyle";
    }
}
