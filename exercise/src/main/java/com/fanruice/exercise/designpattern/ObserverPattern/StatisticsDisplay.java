package com.fanruice.exercise.designpattern.ObserverPattern;

/**
 * @author fan_rc@suixingpay.com
 * @description 统计显示
 * @date 2019/8/28 21:33
 */
public class StatisticsDisplay implements Observer {

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("统计显示收到天气数据变化消息" + temp + "-" + humidity + "-" + pressure);
    }
}
