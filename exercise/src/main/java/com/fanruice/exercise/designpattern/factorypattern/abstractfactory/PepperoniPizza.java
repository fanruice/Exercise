package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;


/**
 * 腊香肠披萨 类
 */
public class PepperoniPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.name = ingredientFactory.create() + "PepperoniPizza";
        System.out.println(this.name + " preparing");
    }
}
