package com.fanruice.exercise.designpattern.interpreterpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 客户端
 */
public class InterpreterClient {

    public static void main(String[] args) {
        String expStr = "a+b-c";
        Map<String, Integer> varMap = new HashMap<>();
        varMap.put("a", 1);
        varMap.put("b", 4);
        varMap.put("c", 2);
        Calculator calculator =new Calculator(expStr);
        int result = calculator.run((HashMap<String, Integer>) varMap);
        System.out.println("运行结果：" + result);
    }
}
