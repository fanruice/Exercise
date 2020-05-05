package com.fanruice.exercise.spring.ioc.dependency.lookup;

import com.fanruice.exercise.spring.ioc.annotation.Super;
import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * 测试依赖查找
 */
public class LookUpClient {

    public static void main(String[] args) {
        // =========依赖查找=======

        //1=====通过名称查找======
        //配置xml文件
        //启动 spring应用上下文
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/dependency-lookup-context.xml");

        lookUpInRealTime(beanFactory);

        lookUpInLazy(beanFactory);

        //2=======通过类型查找======
        //=======通过类型查找单个对象======
        lookUpByType(beanFactory);

        //=======通过类型查找集合对象======
        lookUpCollectionByType(beanFactory);

        //3=======通过注解查找======
        lookUpByAnnotationType(beanFactory);
    }

    /**
     * 实时查找
     * @param beanFactory
     */
    private static void lookUpInRealTime(BeanFactory beanFactory) {
        User user = (User) beanFactory.getBean("user");
        System.out.println("实时查找:" + user);
    }

    /**
     * 延迟查找
     * @param beanFactory
     */
    private static void lookUpInLazy(BeanFactory beanFactory) {
        ObjectFactory<User> objectFactory = (ObjectFactory<User>) beanFactory.getBean("objectFactory");
        User user = objectFactory.getObject();
        System.out.println("延迟查找:" + user);
    }

    /**
     * 通过类型进行查找单一对象
     * @param beanFactory
     */
    private static void lookUpByType(BeanFactory beanFactory) {
        User user = beanFactory.getBean(User.class);
        System.out.println("查找单一对象:" + user);
    }

    /**
     * 通过类型进行查找集合对象
     * @param beanFactory
     */
    private static void lookUpCollectionByType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> beansOfType = listableBeanFactory.getBeansOfType(User.class);
            System.out.println("查找到的所有 user对象:" + beansOfType);
        }
    }

    /**
     * 通过注解进行查找
     * @param beanFactory
     */
    private static void lookUpByAnnotationType(BeanFactory beanFactory) {
        if (beanFactory instanceof ListableBeanFactory) {
            ListableBeanFactory listableBeanFactory = (ListableBeanFactory) beanFactory;
            Map<String, User> beansOfType = (Map) listableBeanFactory.getBeansWithAnnotation(Super.class);
            System.out.println("查找 标注@Super 的所有 user对象:" + beansOfType);
        }
    }
}
