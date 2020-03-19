package com.fanruice.exercise.designpattern.builderpattern;

/**
 * 产品类（车子）
 */
public class Bike {

    private String frame; //框架
    private String seat; //座位
    private String tire; //轮胎

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getTire() {
        return tire;
    }

    public void setTire(String tire) {
        this.tire = tire;
    }
}
