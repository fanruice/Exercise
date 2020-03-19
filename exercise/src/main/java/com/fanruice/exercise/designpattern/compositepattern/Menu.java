package com.fanruice.exercise.designpattern.compositepattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单（组合）
 */
public class Menu extends Component {
    private List<Component> componentList = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return componentList.get(i);
    }

    @Override
    public void print(String s) {
        System.out.println(s + getName());
        s = s + "--|";
        for (Component component : componentList) {
            component.print(s);
        }
    }
}
