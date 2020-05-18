package com.fanruice.exercise.spring.bean.definition;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Bean 别名示例
 */
public class BeanAliasDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/bean-definition-context.xml");

        //通过 Bean 的名称获取对象
        User user = applicationContext.getBean("user", User.class);
        //通过别名获取 Bean 对象
        User xiaomageUser = applicationContext.getBean("xiaomage-user", User.class);

        System.out.println("xiaomageUser 与 user 是否是同一个 Bean？" + (user == xiaomageUser));
        //结果是 相同的
    }
}
