package com.fanruice.exercise.designpattern.interpreterpattern;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解释器封装类
 */
public class Calculator {

    public Expression expression;

    public Calculator(String expStr) {
        //定义一个栈，安排运算的前后顺序
        Stack<Expression> stack = new Stack<>();
        //表达式拆分成为字符数组
        char[] charArray = expStr.toCharArray();
        //运算
        Expression left;
        Expression right;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    //加法结果放到栈中
                    left = stack.pop();
                    i++;
                    right = new VarExpression(String.valueOf(charArray[i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    i++;
                    right = new VarExpression(String.valueOf(charArray[i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    //将变量入栈
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        //将运算结果抛出
        this.expression = stack.pop();
    }

    /**
     * 运算
     * @param var
     * @return
     */
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
