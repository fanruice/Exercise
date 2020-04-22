package com.fanruice.exercise.designpattern.interpreterpattern;

import java.util.HashMap;

/**
 * 加法解析器
 */
public class AddExpression extends SymbolExpression {

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param left
     * @param right
     */
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 左右两个表达式运算的结果相加
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
