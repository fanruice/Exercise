package com.fanruice.exercise.designpattern.flyweightpattern;

/**
 * 具体的享元角色2
 */
public class ConcreateFlyweight2 extends Flyweight {

    public ConcreateFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println("具体的享元角色2正在进行业务的处理！");
    }
}
