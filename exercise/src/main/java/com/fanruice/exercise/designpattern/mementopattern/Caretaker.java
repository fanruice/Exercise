package com.fanruice.exercise.designpattern.mementopattern;

/**
 * 备忘录管理者
 */
public class Caretaker {

    private IMemento iMemento;

    public IMemento getiMemento() {
        return iMemento;
    }

    public void setiMemento(IMemento iMemento) {
        this.iMemento = iMemento;
    }
}
