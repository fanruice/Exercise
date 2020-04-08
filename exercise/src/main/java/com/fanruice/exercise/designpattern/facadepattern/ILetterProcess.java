package com.fanruice.exercise.designpattern.facadepattern;

/**
 * 写信过程接口
 */
public interface ILetterProcess {

    /**
     * 写信
     * @param context
     */
    void writeContext(String context);

    /**
     * 写信封
     * @param address
     */
    void fillEnvelope(String address);

    /**
     * 把信放到信封里
     */
    void letterIntoEnvelope();

    /**
     * 邮寄
     */
    void sendLetter();
}
