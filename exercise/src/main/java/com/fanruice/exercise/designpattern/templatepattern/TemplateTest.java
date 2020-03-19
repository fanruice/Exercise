package com.fanruice.exercise.designpattern.templatepattern;

/**
 * 测试
 */
public class TemplateTest {

    public static void main(String[] args) {
        //泡茶
        Tea tea = new Tea();
        tea.prepareRecipe();
        //泡咖啡
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
