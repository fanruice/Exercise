package com.fanruice.exercise.designpattern.facadepattern;

/**
 * 客户端
 */
public class FacadeClient {

    public static void main(String[] args) {
        PostOffice postOffice = new PostOffice();
        postOffice.sendLetter("老铁666", "河北衡水");
    }
}
