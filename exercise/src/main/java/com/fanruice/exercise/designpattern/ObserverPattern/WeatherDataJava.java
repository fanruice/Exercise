package com.fanruice.exercise.designpattern.ObserverPattern;

import java.util.Observable;

/**
 * @author fan_rc@suixingpay.com
 * @description 基于Java内部的Observable类实现被观察者类
 * @date 2019/8/29 21:04
 */
public class WeatherDataJava extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * @description 当从气象站得到更新观测值时，我们通知观察者
     * @author fan_rc@suixingpay.com
     * @date 2019/8/28 21:23
     */
    public void measurementsChanged() {
        setChanged();
        notifyObservers(temperature);
    }

    /**
     * 设置天气数据(同时，改变天气数据，通知观察者)
     *
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
