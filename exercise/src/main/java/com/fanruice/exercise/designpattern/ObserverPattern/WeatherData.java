package com.fanruice.exercise.designpattern.ObserverPattern;

import java.util.ArrayList;

/**
 * @author fan_rc@suixingpay.com
 * @description 天气数据 主题实现类
 * @date 2019/8/28 21:17
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * @param
     * @return
     * @throws
     * @description 当从气象站得到更新观测值时，我们通知观察者
     * @author fan_rc@suixingpay.com
     * @date 2019/8/28 21:23
     */
    public void measurementsChanged() {
        notifyObservers();
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
