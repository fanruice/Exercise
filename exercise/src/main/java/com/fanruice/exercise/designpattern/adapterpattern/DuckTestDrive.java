package com.fanruice.exercise.designpattern.adapterpattern;

public class DuckTestDrive {

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("the turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("the duck sats...");
        duck.quack();
        duck.fly();

        System.out.println("the turkeyAdapter syas...");
        testDuck(turkeyAdapter);
    }
}
