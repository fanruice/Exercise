package com.fanruice.exercise.designpattern.interpreterpattern;

import java.util.HashMap;

/**
 * 抽象表达式类
 */
public abstract class Expression {

    /**
     * 解析表达式和数值，我中var中的key值为公式中的参数，value为其具体的数值。
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);
}
