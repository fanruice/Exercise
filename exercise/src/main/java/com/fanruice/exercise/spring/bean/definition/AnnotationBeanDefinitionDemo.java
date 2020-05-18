package com.fanruice.exercise.spring.bean.definition;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionReaderUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 注解 BeanDefinition 实例
 */
@Import(AnnotationBeanDefinitionDemo.Config.class) //3、通过 @Import 来进行导入
public class AnnotationBeanDefinitionDemo {

    public static void main(String[] args) {
        //创建 BeanFactory 容器
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //注册Configuration Class（配置类）
        applicationContext.register(AnnotationBeanDefinitionDemo.class);
        //启动应用上下文
        applicationContext.refresh();
        //1、通过 @Bean 方式定义
        //2、通过 @Component 方式
        //3、通过 @Import 来进行导入
        //我们发现 @Import 和 @Component 都把 Config 作为一个 Bean，那么会重复注册 Config 吗，不会！！！
        //同样 User  也不会重复注册

        //通过 BeanDefinition 注册 API 来实现
        //1、命名方式
        registerUserBeanDefinition(applicationContext, "mercyblitz-user");
        //2、非命名方式
        registerUserBeanDefinition(applicationContext);

        System.out.println("Config 类型的所有的 Bean" + applicationContext.getBeansOfType(Config.class));
        System.out.println("User 类型的所有的 Bean" + applicationContext.getBeansOfType(User.class));

        //显示的关闭 Spring 应用上下文
        applicationContext.close();
    }

    @Component //2、定义当前类作为一个 Spring Bean（组件）
    public static class Config {
        /**
         * 1、通过Java注解的方式定义一个Bean
         * @return
         */
        @Bean(name = {"user", "xiaomage-user"})
        public User user() {
            User user = new User();
            user.setId(1);
            user.setName("小马哥");
            return user;
        }
    }

    /**
     * Bean 的注册方式
     * @param registry
     * @param beanName
     */
    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry, String beanName) {

        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        beanDefinitionBuilder
                .addPropertyValue("id", 1)
                .addPropertyValue("name", "小马哥");

        //判断如果 BeanName 存在
        if (StringUtils.hasText(beanName)) {
            //命名 Bean 的注册方式
            //注册BeanDefinition
            registry.registerBeanDefinition(beanName, beanDefinitionBuilder.getBeanDefinition());
        } else {
            //非命名 Bean 的注册方式
            BeanDefinitionReaderUtils.registerWithGeneratedName(beanDefinitionBuilder.getBeanDefinition(), registry);
        }


    }

    public static void registerUserBeanDefinition(BeanDefinitionRegistry registry) {
        registerUserBeanDefinition(registry, null);
    }
}
