package com.fanruice.exercise.designpattern.builderpattern;

import com.alibaba.fastjson.JSON;

/**
 * 客户端
 */
public class Client {


    public static void main(String[] args) {

        Director director = new Director(new MobikeBuilder());
        //两种创建的顺序不一样
        Bike bike = director.construct();
        System.out.println(JSON.toJSON(bike));
        Bike bike1 = director.construct1();
        System.out.println(JSON.toJSON(bike1));

    }

}
