package com.fanruice.exercise.designpattern.iteratorpattern;

import com.alibaba.fastjson.JSONObject;

import java.util.*;

/**
 * 测试类
 */
public class IteratorTest {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem("DinerMenu的第五道菜", "DinerMenu的第五道菜的描述", true, 6.99);
        Iterator iterator = dinerMenu.createIterator();
        while (iterator.hasNext()) {
            System.out.println(JSONObject.toJSONString(iterator.next()));
        }
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Iterator<MenuItem> iterator1 = pancakeHouseMenu.getMenuItems().iterator();
        while(iterator1.hasNext()) {
            System.out.println(JSONObject.toJSONString(iterator1.next()));
        }
    }
}
