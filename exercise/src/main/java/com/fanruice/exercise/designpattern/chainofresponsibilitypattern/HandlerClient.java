package com.fanruice.exercise.designpattern.chainofresponsibilitypattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 客户端
 */
public class HandlerClient {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        //设置链中执行顺序
        TheRequest request1 = new TheRequest();
        request1.setLevel(1);
        TheRequest request2 = new TheRequest();
        request2.setLevel(2);
        TheRequest request3 = new TheRequest();
        request3.setLevel(3);
        TheRequest request4 = new TheRequest();
        request4.setLevel(4);

        List<TheRequest> requests = new ArrayList<>();
        requests.add(request1);
        requests.add(request2);
        requests.add(request3);
        requests.add(request4);

        //由第一条链去处理所有的请求
        for (TheRequest request : requests) {
            TheResponse response = handler1.handleMessage(request);
            System.out.println(response);
        }
    }
}
