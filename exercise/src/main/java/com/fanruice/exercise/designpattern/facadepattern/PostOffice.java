package com.fanruice.exercise.designpattern.facadepattern;

/**
 * 邮局
 */
public class PostOffice {

    /**
     * 写信 写信封 封装 投递 一体化
     * @param context
     * @param address
     */
    public void sendLetter(String context, String address) {
        ILetterProcess iLetterProcess = new ILetterProcessImpl();
        iLetterProcess.writeContext(context);
        iLetterProcess.fillEnvelope(address);
        iLetterProcess.letterIntoEnvelope();
        iLetterProcess.sendLetter();
    }
}
