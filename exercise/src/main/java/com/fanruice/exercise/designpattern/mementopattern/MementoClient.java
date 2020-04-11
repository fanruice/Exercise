package com.fanruice.exercise.designpattern.mementopattern;

/**
 * 客户端
 */
public class MementoClient {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        //初始状态
        originator.setStatus("hello");
        System.out.println(originator.getStatus());

        //用备忘录保存起来
        caretaker.setiMemento(originator.createMemento());

        //修改状态
        originator.setStatus("你好");
        System.out.println(originator.getStatus());

        //用备忘录恢复
        originator.restoreMemento(caretaker.getiMemento());
        System.out.println(originator.getStatus());
    }
}
