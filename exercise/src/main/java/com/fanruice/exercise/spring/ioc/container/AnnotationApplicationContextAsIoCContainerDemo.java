package com.fanruice.exercise.spring.ioc.container;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Map;

/**
 * 有注解能力的 ApplicationContext 作为 IoC容器示例
 */
public class AnnotationApplicationContextAsIoCContainerDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //将当前类作为配置类
        applicationContext.register(AnnotationApplicationContextAsIoCContainerDemo.class);

        applicationContext.refresh();
        lookUpCollectionByType(applicationContext);
    }

    /**
     * 通过Java注解的方式定义一个Bean
     * @return
     */
    @Bean
    public User user() {
        User user = new User();
        user.setId(1);
        user.setName("小马哥");
        return user;
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
