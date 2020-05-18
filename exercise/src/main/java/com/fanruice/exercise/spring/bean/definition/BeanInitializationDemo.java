package com.fanruice.exercise.spring.bean.definition;

import com.alibaba.fastjson.JSONObject;
import com.fanruice.exercise.spring.bean.factory.DefaultUserFactory;
import com.fanruice.exercise.spring.bean.factory.UserFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import java.util.Map;

/**
 * Bean 初始化 示例
 */
@Configuration
public class BeanInitializationDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();

        applicationContext.register(BeanInitializationDemo.class);

        applicationContext.refresh();
        System.out.println("Spring 应用上下文启动成功");

        Map<String, UserFactory> beansOfType = applicationContext.getBeansOfType(UserFactory.class);
        System.out.println(JSONObject.toJSON(beansOfType));

        System.out.println("Spring 应用上下文准备关闭");
        applicationContext.close();
        System.out.println("Spring 应用上下文已关闭");
    }

    @Bean(initMethod = "initByBeanInit", destroyMethod = "doDestroy")
    public DefaultUserFactory userFactory() {
        return new DefaultUserFactory();
    }
}
