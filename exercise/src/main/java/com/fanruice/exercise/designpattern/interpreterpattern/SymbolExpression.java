package com.fanruice.exercise.designpattern.interpreterpattern;

/**
 * 抽象运算符号解析器
 */
public abstract class SymbolExpression extends Expression {

    public Expression left;
    public Expression right;

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     * @param left
     * @param right
     */
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
