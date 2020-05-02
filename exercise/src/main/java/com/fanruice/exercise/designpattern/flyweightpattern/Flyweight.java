package com.fanruice.exercise.designpattern.flyweightpattern;

/**
 * 抽象的享元角色
 */
public abstract class Flyweight {

    //内部状态
    private String intrinsic;
    //外部状态
    public final String extrinsic;

    //要求享元角色必须接受外部状态

    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    //定义业务逻辑
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
