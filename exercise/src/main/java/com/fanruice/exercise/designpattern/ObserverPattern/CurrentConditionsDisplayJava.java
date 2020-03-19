package com.fanruice.exercise.designpattern.ObserverPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @author fan_rc@suixingpay.com
 * @description 基于java的观察者类实现观察者
 * @date 2019/8/29 21:06
 */
public class CurrentConditionsDisplayJava implements Observer {

    private Observable observable;

    public CurrentConditionsDisplayJava(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataJava) {
            WeatherDataJava weatherDataJava = (WeatherDataJava) o;
            System.out.println(arg);
        }
    }
}
