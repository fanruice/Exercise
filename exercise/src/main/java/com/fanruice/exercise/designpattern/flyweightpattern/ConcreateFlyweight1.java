package com.fanruice.exercise.designpattern.flyweightpattern;

/**
 * 具体的享元角色1
 */
public class ConcreateFlyweight1 extends Flyweight {

    public ConcreateFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        System.out.println("具体的享元角色1正在进行业务的处理！");
    }
}
