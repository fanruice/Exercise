package com.fanruice.exercise.designpattern.facadepattern;

/**
 * 写信过程实现类
 */
public class ILetterProcessImpl implements ILetterProcess {

    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容：" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写信封：" + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("把信放到信封里");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮寄信件");
    }
}
