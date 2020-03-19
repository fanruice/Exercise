package com.fanruice.exercise.designpattern.prototypepattern;

/**
 * 测试类
 */
public class PrototypeClient {

    public static void main(String[] args) {
        //原型模式完成对象的克隆
        Sheep sheep = new Sheep("tom", 1, "白色");
        Sheep sheep2 = sheep.clone();
        Sheep sheep3 = sheep.clone();
        Sheep sheep4 = sheep.clone();
        Sheep sheep5 = sheep.clone();

        System.out.println(sheep.toString());
        System.out.println(sheep2.toString());
        System.out.println(sheep3.toString());
        System.out.println(sheep4.toString());
        System.out.println(sheep5.toString());

        //浅拷贝
        ShallowCopy shallowCopy = new ShallowCopy();
        shallowCopy.setType("浅拷贝");
        shallowCopy.setSheep(new Sheep("喜羊羊", 2, "白色"));
        ShallowCopy shallowCopy1 = shallowCopy.clone();
        ShallowCopy shallowCopy2 = shallowCopy.clone();
        ShallowCopy shallowCopy3 = shallowCopy.clone();
        ShallowCopy shallowCopy4 = shallowCopy.clone();
        //可以发现ShallowCopy对象中的Sheep对象的hashCode都是一样的。即为浅拷贝
        //如果修改某一个Sheep对象的属性，则全部都会修改。
        //java只拷贝你指定的对象，至于你指定的对象里面的别的对象，它不拷贝，
        // 还是把引用给你，共享变量，这是一种非常不安全的方式，需要特别注意。
        //　　内部的数组和引用对象不会拷贝，其他的原始基本类型和String类型会被拷贝。
        System.out.println(shallowCopy.toString() + shallowCopy.getSheep().hashCode());
        System.out.println(shallowCopy1.toString() + shallowCopy1.getSheep().hashCode());
        System.out.println(shallowCopy2.toString() + shallowCopy2.getSheep().hashCode());
        System.out.println(shallowCopy3.toString() + shallowCopy3.getSheep().hashCode());
        System.out.println(shallowCopy4.toString() + shallowCopy4.getSheep().hashCode());

        //深拷贝
        //1、重写clone方法实现深拷贝
        DeepCopy deepCopy = new DeepCopy();
        deepCopy.setType("深拷贝");
        deepCopy.setSheep(new Sheep("喜羊羊", 2, "白色"));
        DeepCopy deepCopy1 = deepCopy.clone();
        DeepCopy deepCopy2 = deepCopy.clone();
        DeepCopy deepCopy3 = deepCopy.clone();
        DeepCopy deepCopy4 = deepCopy.clone();
        System.out.println("1、重写clone方法实现深拷贝");
        System.out.println(deepCopy.toString() + deepCopy.getSheep().hashCode());
        System.out.println(deepCopy1.toString() + deepCopy1.getSheep().hashCode());
        System.out.println(deepCopy2.toString() + deepCopy2.getSheep().hashCode());
        System.out.println(deepCopy3.toString() + deepCopy3.getSheep().hashCode());
        System.out.println(deepCopy4.toString() + deepCopy4.getSheep().hashCode());
        //2、通过对象的序列化实现深拷贝
        DeepCopy deepCopy5 = deepCopy.otherDeepCopy();
        DeepCopy deepCopy6 = deepCopy.otherDeepCopy();
        DeepCopy deepCopy7 = deepCopy.otherDeepCopy();
        DeepCopy deepCopy8 = deepCopy.otherDeepCopy();
        System.out.println("2、通过对象的序列化实现深拷贝");
        System.out.println(deepCopy5.toString() + deepCopy5.getSheep().hashCode());
        System.out.println(deepCopy6.toString() + deepCopy6.getSheep().hashCode());
        System.out.println(deepCopy7.toString() + deepCopy7.getSheep().hashCode());
        System.out.println(deepCopy8.toString() + deepCopy8.getSheep().hashCode());
    }
}
