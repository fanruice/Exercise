package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;


/**
 * 芝士披萨 类
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.name = ingredientFactory.create() + "CheesePizza";
        System.out.println(this.name + " preparing");
    }
}
