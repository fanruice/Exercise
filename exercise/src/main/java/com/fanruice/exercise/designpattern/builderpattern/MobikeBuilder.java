package com.fanruice.exercise.designpattern.builderpattern;

/**
 * 膜拜单车具体建造者类
 */
public class MobikeBuilder extends Builder {

    private Bike myBike = new Bike();

    @Override
    void bulidFrame() {
        myBike.setFrame("创建摩拜单车的frame");
    }

    @Override
    void bulidSeat() {
        myBike.setSeat("创建摩拜单车的seat");
    }

    @Override
    void bulidTire() {
        myBike.setTire("创建摩拜单车的tire");
    }

    @Override
    Bike createBike() {
        return myBike;
    }
}
