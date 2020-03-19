package com.fanruice.exercise.designpattern.statepattern;

/**
 * 糖果机没有25美分状态1
 */
public class NoQuarterState implements State {

    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    /**
     * 没给钱的情况，是不允许退钱的
     */
    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted quarter");
    }

    /**
     * 没给钱 不能要求糖果
     */
    @Override
    public void turnCrank() {
        System.out.println("You turned,but there's no quarter");
    }

    /**
     * 没得到钱，我们就不能发放糖果
     */
    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
