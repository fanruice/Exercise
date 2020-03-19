package com.fanruice.exercise.designpattern.ObserverPattern;

/**
 * @author fan_rc@suixingpay.com
 * @description 观察者接口
 * @date 2019/8/28 21:07
 */
public interface Observer {

    /**
     * @param temp
     * @param humidity
     * @param pressure
     * @description 当主题内容改变时，需要更新观察者的温度等状态
     * @author fan_rc@suixingpay.com
     * @date 2019/8/28 21:16
     */
    void update(float temp, float humidity, float pressure);
}
