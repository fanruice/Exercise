package com.fanruice.exercise.designpattern.iteratorpattern;

import java.util.Iterator;

/**
 * DinerMenu(基于数组实现)
 */
public class DinerMenu {

    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("DinerMenu的第一道菜", "DinerMenu的第一道菜的描述", true, 2.99);
        addItem("DinerMenu的第二道菜", "DinerMenu的第二道菜的描述", false, 3.99);
        addItem("DinerMenu的第三道菜", "DinerMenu的第三道菜的描述", true, 4.99);
        addItem("DinerMenu的第四道菜", "DinerMenu的第四道菜的描述", false, 5.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem meunItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("对不起，菜单已经满了！");
        } else {
            menuItems[numberOfItems] = meunItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItem() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
