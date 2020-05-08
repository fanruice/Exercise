package com.fanruice.exercise.spring.ioc.container;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * BeanFactory 作为IoC容器示例
 */
public class BeanFactoryAsIoCContainerDemo {

    public static void main(String[] args) {
        //创建 BeanFactory 容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //XML配置文件路径
        String  location = "META-INF/dependency-lookup-context.xml";
        //加载配置
        int beanDefinitions = reader.loadBeanDefinitions(location);
        System.out.println("Bean 定义加载的数量：" + beanDefinitions);
        //依赖查找
        lookUpCollectionByType(beanFactory);
        //说明不在ApplicationContext的情况下，也可以加载Bean文件
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
}
