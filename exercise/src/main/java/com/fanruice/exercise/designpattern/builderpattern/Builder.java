package com.fanruice.exercise.designpattern.builderpattern;

/**
 * 抽象建造者类
 */
public abstract class Builder {

    abstract void bulidFrame(); //建造框架

    abstract void bulidSeat(); //建造座位

    abstract void bulidTire(); //建造轮胎

    abstract Bike createBike(); //创建自行车
}
