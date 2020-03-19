package com.fanruice.exercise.designpattern.factorypattern.abstractfactory;


/**
 * 希腊披萨 类
 */
public class GreekPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public GreekPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        this.name = ingredientFactory.create() + "GreekPizza";
        System.out.println(this.name + " preparing");
    }
}
