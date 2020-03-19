package com.fanruice.exercise.designpattern.iteratorpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 煎饼屋（基于list实现）
 */
public class PancakeHouseMenu {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("PancakeHouseMenu的第一道菜", "PancakeHouseMenu的第一道菜的描述", true, 2.99);
        addItem("PancakeHouseMenu的第二道菜", "PancakeHouseMenu的第二道菜的描述", false, 3.99);
        addItem("PancakeHouseMenu的第三道菜", "PancakeHouseMenu的第三道菜的描述", true, 4.99);
        addItem("PancakeHouseMenu的第四道菜", "PancakeHouseMenu的第四道菜的描述", false, 5.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem meunItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(meunItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
