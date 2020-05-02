package com.fanruice.exercise.designpattern.flyweightpattern;

/**
 * 客户端
 */
public class FlyweightClient {

    public static void main(String[] args) {
        //初始化对象池
        for (int i = 0; i < 4; i++) {
            String extrinsic = "the" + i;
            Flyweight flyweiht = FlyweightFactory.getFlyweiht(extrinsic);
            System.out.println("获取到的对象：" + flyweiht);
        }

        Flyweight the1 = FlyweightFactory.getFlyweiht("the1");
        System.out.println("获取到的对象：" + the1);
    }
}
