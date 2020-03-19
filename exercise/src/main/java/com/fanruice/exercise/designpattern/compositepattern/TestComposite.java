package com.fanruice.exercise.designpattern.compositepattern;

/**
 * 测试组合模式
 */
public class TestComposite {

    public static void main(String[] args) {
        Menu menu = new Menu("菜单");

        Menu menu1 = new Menu("早餐");
        Menu menu2 = new Menu("午餐");

        Menu menu11 = new Menu("早餐1");
        Menu menu12 = new Menu("早餐2");

        Item item1 = new Item("早餐1第一道菜");
        Item item2 = new Item("早餐1第二道菜");
        menu11.add(item1);
        menu11.add(item2);

        menu1.add(menu11);
        menu1.add(menu12);

        Item item3 = new Item("早餐2第一道菜");
        menu12.add(item3);

        Menu menu21 = new Menu("午餐1");
        Menu menu22 = new Menu("午餐2");
        menu2.add(menu21);
        menu2.add(menu22);

        menu.add(menu1);
        menu.add(menu2);

        menu.print("");
    }
}
