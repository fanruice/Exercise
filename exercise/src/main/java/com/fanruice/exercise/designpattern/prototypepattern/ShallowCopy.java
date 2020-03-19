package com.fanruice.exercise.designpattern.prototypepattern;

/**
 * 浅拷贝
 */
public class ShallowCopy implements Cloneable {

    private String type;
    private Sheep sheep;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "ShallowCopy{" + "type='" + type + '\'' + ", sheep=" + sheep + '}';
    }

    @Override
    protected ShallowCopy clone() {
        ShallowCopy shallowCopy = null;
        try {
            shallowCopy = (ShallowCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("ShallowCopy克隆异常:" + e);
        }
        return shallowCopy;
    }
}
