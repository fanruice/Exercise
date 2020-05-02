package com.fanruice.exercise.designpattern.flyweightpattern;

import java.util.HashMap;

/**
 * 享元工厂
 */
public class FlyweightFactory {

    //定义一个对象池
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweiht(String extrinsic) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            //如果不存在的话，需要根据外部状态来创建享元对象
            flyweight = new ConcreateFlyweight1(extrinsic);
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
