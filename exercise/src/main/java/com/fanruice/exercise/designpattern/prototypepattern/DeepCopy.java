package com.fanruice.exercise.designpattern.prototypepattern;

import java.io.*;

/**
 * 深拷贝
 */
public class DeepCopy implements Cloneable, Serializable {

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
        return "DeepCopy{" + "type='" + type + '\'' + ", sheep=" + sheep + '}';
    }

    /**
     * 重写clone方法实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected DeepCopy clone() {
        DeepCopy deepCopy = null;
        try {
            //完成基本数据类型和String类型的拷贝
            deepCopy = (DeepCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("DeepCopy克隆异常：" + e);
        }
        //对引用类型的属性，单独进行处理
        deepCopy.sheep = deepCopy.getSheep().clone();
        return deepCopy;
    }

    /**
     * 通过对象的序列化实现深拷贝（推荐使用）
     */
    public DeepCopy otherDeepCopy() {
        DeepCopy deepCopy = null;

        ByteArrayInputStream bais = null;
        ObjectInputStream ois = null;

        ByteArrayOutputStream baos = null;
        ObjectOutputStream oos = null;

        //序列化
        try {
            baos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(baos);
            oos.writeObject(this); //当前对象以对象流的方式输出

            bais = new ByteArrayInputStream(baos.toByteArray());
            ois = new ObjectInputStream(bais);
            deepCopy = (DeepCopy) ois.readObject();
        } catch (Exception e) {
            System.out.println("克隆异常：" + e);
        } finally {
            try {
                if (baos != null) {
                    baos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bais != null) {
                    bais.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return deepCopy;
    }
}
