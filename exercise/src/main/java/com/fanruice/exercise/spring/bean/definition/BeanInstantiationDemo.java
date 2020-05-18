package com.fanruice.exercise.spring.bean.definition;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 实例化 示例
 */
public class BeanInstantiationDemo {

    public static void main(String[] args) {

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/bean-instantiation-context.xml");
        // 通过静态工厂方法来进行实例化 Bean
        // 是从User 类的静态方法 createUser 中生成的
        User user1 = beanFactory.getBean("userByStaticMethod", User.class);
        System.out.println(user1);
        //通过 Bean 工厂方法   user1 与 user2 是不相等的
        User user2 = beanFactory.getBean("userByInstanceMethod", User.class);
        System.out.println(user2);
        System.out.println(user1 == user2);
        //通过 FactoryBean 的方式实例化Bean user1 与 user3 是不相等的
        User user3 = beanFactory.getBean("userByFactoryBean", User.class);
        System.out.println(user3);
        System.out.println(user1 == user3);
    }
}
