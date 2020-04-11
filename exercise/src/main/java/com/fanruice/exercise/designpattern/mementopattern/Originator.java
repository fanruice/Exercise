package com.fanruice.exercise.designpattern.mementopattern;

/**
 * 发起人
 */
public class Originator {

    private String status; //内部状态

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 创建一个备忘录
     */
    public IMemento createMemento() {
        return new Memento(this.status);
    }

    /**
     * 恢复一个备忘录
     */
    public void restoreMemento(IMemento iMemento) {
        this.status = ((Memento) iMemento).getStatus();
    }

    /**
     * 内置的备忘录类
     */
    private class Memento implements IMemento {
        private String status; //发起人的内部状态

        private Memento(String status) {
            this.status = status;
        }

        private String getStatus() {
            return status;
        }

        private void setStatus(String status) {
            this.status = status;
        }
    }
}
