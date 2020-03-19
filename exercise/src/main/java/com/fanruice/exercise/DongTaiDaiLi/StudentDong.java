package com.fanruice.exercise.DongTaiDaiLi;


import com.fanruice.exercise.jingtaidaili.Person;

/**
 * @description  学生类
 * @author fanruice
 * @date   2018/11/8 20:11
 */
public class StudentDong implements Person {
    private String name;

    public StudentDong(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "上交班费");
    }
}
