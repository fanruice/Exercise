package com.fanruice.exercise.designpattern.builderpattern;

/**
 * 小黄车建造者类
 */
public class OfoBuilder extends Builder {

    private Bike myBike = new Bike();

    @Override
    void bulidFrame() {
        myBike.setFrame("创建小黄车的frame");
    }

    @Override
    void bulidSeat() {
        myBike.setSeat("创建小黄车的seat");
    }

    @Override
    void bulidTire() {
        myBike.setTire("创建小黄车的tire");
    }

    @Override
    Bike createBike() {
        return myBike;
    }
}
