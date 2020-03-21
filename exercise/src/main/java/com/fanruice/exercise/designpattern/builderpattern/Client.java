package com.fanruice.exercise.designpattern.builderpattern;

import com.alibaba.fastjson.JSON;

/**
 * 客户端
 */
public class Client {


    public static void main(String[] args) {

        Director director = new Director(new MobikeBuilder());
        Bike bike = director.construct();
        System.out.println(JSON.toJSON(bike));
    }

}
