package com.fanruice.exercise.designpattern.builderpattern;

import com.alibaba.fastjson.JSON;

/**
 * 利用建造者模式创建电脑对象
 */
public class ComputerClient {

    public static void main(String[] args) {
        //利用普通方式创建对象
        Computer computer = new Computer("cpu", "screen", "memory", "mainboard");
        System.out.println(JSON.toJSON(computer));
        //利用建造者模式创建对象
        Computer computer1 = new Computer.ComputerBuilder()
                .cpu("cpu")
                .screen("screen")
                .memory("memory")
                .mainboard("mainboard")
                .build();
        System.out.println(JSON.toJSON(computer1));
    }
}
