package com.fanruice.exercise.designpattern.bridgePattern;

/**
 * 房地产公司（具体的公司类）
 */
public class HouseCorp extends Corp {

    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了！");
    }
}
