package com.fanruice.exercise.jingtaidaili;

/**
 * @description  学生类
 * @author fanruice
 * @date   2018/11/8 14:58
 */
public class Student implements Person {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        System.out.println(name + "上交班费");
    }
}
