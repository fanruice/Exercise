package com.fanruice.exercise.designpattern.compositepattern;

/**
 * Component(为组合中的所有对象定义一个接口，不管是组合 还是叶子节点)
 */
public abstract class Component {

    /**
     * 组合和叶子节点都具备的行为
     */
    public void print(String s) {
        throw new UnsupportedOperationException();
    }

    /**
     * 添加（组合具备）
     * @param component
     */
    public void add(Component component) { throw new UnsupportedOperationException();}

    /**
     * 移除（组合具备）
     * @param component
     */
    public void remove(Component component) { throw new UnsupportedOperationException();}

    /**
     * 获取第i个孩子（组合具备）
     * @param i
     */
    public Component getChild(int i) { throw new UnsupportedOperationException();}
}
