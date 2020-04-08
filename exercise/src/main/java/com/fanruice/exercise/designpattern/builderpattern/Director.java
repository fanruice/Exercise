package com.fanruice.exercise.designpattern.builderpattern;

/**
 * 指挥者类
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.bulidFrame();
        builder.bulidSeat();
        builder.bulidTire();
        return builder.createBike();
    }

    public Bike construct1() {
        builder.bulidSeat();
        builder.bulidFrame();
        builder.bulidTire();
        return builder.createBike();
    }
}
