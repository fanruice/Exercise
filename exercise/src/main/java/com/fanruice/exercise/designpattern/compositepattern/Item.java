package com.fanruice.exercise.designpattern.compositepattern;

/**
 * 每个菜单所具有的项（叶子节点）
 */
public class Item extends Component {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print(String s) {
        System.out.println(s + getName());
    }
}
