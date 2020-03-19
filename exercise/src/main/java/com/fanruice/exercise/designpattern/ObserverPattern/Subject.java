package com.fanruice.exercise.designpattern.ObserverPattern;

/**
 * @author fan_rc@suixingpay.com
 * @description 主题接口
 * @date 2019/8/28 21:08
 */
public interface Subject {

    /**
     * @param
     * @return
     * @throws
     * @description 注册成为观察者
     * @author fan_rc@suixingpay.com
     * @date 2019/8/28 21:09
     */
    void registerObserver(Observer observer);

    /**
     * @param
     * @return
     * @throws
     * @description 删除观察者
     * @author fan_rc@suixingpay.com
     * @date 2019/8/28 21:10
     */
    void removeObserver(Observer observer);

    void notifyObservers();
}
