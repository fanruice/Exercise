package com.fanruice.exercise.designpattern.visitorpattern;

import java.util.Random;

/**
 * 结构对象
 */
public class ObjectStuture {

    /**
     * 创建对象
     * @return
     */
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}
