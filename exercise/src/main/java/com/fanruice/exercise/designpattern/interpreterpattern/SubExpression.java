package com.fanruice.exercise.designpattern.interpreterpattern;

import java.util.HashMap;

/**
 * 减法解析器
 */
public class SubExpression extends SymbolExpression {

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param left
     * @param right
     */
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 左右两个表达式相减
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
