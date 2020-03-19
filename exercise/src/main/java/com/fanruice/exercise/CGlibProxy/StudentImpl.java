package com.fanruice.exercise.CGlibProxy;

/**
 * @description  学生类
 * @author fanruice
 * @date   2018/11/15 10:53
 */
public class StudentImpl {

    private String name;

    public StudentImpl(String name) {
        this.name = name;
    }

    public void giveMoney() {
        System.out.println(name + "上交班费");
    }
}
