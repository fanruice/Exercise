package com.fanruice.exercise.designpattern.visitorpattern;

/**
 * 客户端
 */
public class VisitorClient {

    public static void main(String[] args) {
        Element element = ObjectStuture.createElement();
        element.accept(new Visitor());
    }
}
