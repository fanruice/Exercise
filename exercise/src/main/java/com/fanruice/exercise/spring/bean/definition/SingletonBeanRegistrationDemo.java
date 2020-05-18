package com.fanruice.exercise.spring.bean.definition;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 单体 Bean 注册 实例
 * */
public class SingletonBeanRegistrationDemo {

    public static void main(String[] args) {
        //创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        User user = new User();

        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        //注册外部单例Bean
        beanFactory.registerSingleton("user", user);

        applicationContext.refresh();

        User contextBean = applicationContext.getBean("user", User.class);
        System.out.println(user == contextBean);

        applicationContext.close();
    }
}
