package com.fanruice.exercise.spring.bean.definition;

import com.fanruice.exercise.spring.bean.factory.DefaultUserFactory;
import com.fanruice.exercise.spring.bean.factory.UserFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 特殊的 Bean 实例化 示例
 */
public class SpecialBeanInstantiationDemo {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/special-bean-instantiation-context.xml");

        //1、ServiceLoaderFactoryBean 方式实例化 Bean
        ServiceLoader<UserFactory> serviceLoader = applicationContext.getBean("UserFactoryServiceLoader", ServiceLoader.class);
        displayServiceLoader(serviceLoader);

        //2、通过 AutowireCapableBeanFactory.createBean 创建 Bean
        //通过 ApplicationContext 获取 AutowireCapableBeanFactory 的实现
        AutowireCapableBeanFactory autowireCapableBeanFactory = applicationContext.getAutowireCapableBeanFactory();
        //创建 UserFactory 对象
        UserFactory userFactory = autowireCapableBeanFactory.createBean(DefaultUserFactory.class);
        System.out.println(userFactory.createUser());
    }

    public static void demoServiceLoader() {
        ServiceLoader<UserFactory> serviceLoader = ServiceLoader.load(UserFactory.class, Thread.currentThread().getContextClassLoader());
        displayServiceLoader(serviceLoader);
    }

    private static void displayServiceLoader(ServiceLoader<UserFactory> serviceLoader) {
        Iterator<UserFactory> iterator = serviceLoader.iterator();

        while (iterator.hasNext()) {
            UserFactory userFactory = iterator.next();
            System.out.println(userFactory.createUser());
        }
    }
}
