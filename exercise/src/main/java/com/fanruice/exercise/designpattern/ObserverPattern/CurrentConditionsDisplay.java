package com.fanruice.exercise.designpattern.ObserverPattern;

/**
 * @description 实时显示（观察者）
 * 
 * @author fan_rc@suixingpay.com
 * @date 2019/8/28 21:25
 */
public class CurrentConditionsDisplay implements Observer {

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("实时显示观察者收到天气数据变化消息" + temp + "-" + humidity + "-" + pressure);
    }
}
