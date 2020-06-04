package com.fanruice.exercise.spring.ioc.dependency.lookup;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * 通过 {@link org.springframework.beans.factory.ObjectProvider} 进行依赖查找
 */
public class ObjectProviderDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ObjectProviderDemo.class);

        applicationContext.refresh();
        lookupByObjectProvider(applicationContext);

        lookupIfAvailable(applicationContext);

        lookupByStreamOps(applicationContext);

        applicationContext.close();
    }

    private static void lookupByStreamOps(AnnotationConfigApplicationContext applicationContext) {
        //延迟加载
        ObjectProvider<String> beanProvider = applicationContext.getBeanProvider(String.class);
        for (String s : beanProvider) {
            System.out.println(s);
        }
        //还可以用 lambda 表达式去做
        beanProvider.stream().forEach(System.out::println);
    }

    /**
     * 延迟查找
     * @param applicationContext
     */
    private static void lookupIfAvailable(AnnotationConfigApplicationContext applicationContext) {
        ObjectProvider<User> userObjectProvider = applicationContext.getBeanProvider(User.class);
        //很显然   当前Spring上下文里面是没有 User 的任何对象的

        //当 User 的对象不存在的时候，就会调用 User 类的createUser 方法 来生成一个新的 User 的对象，并添加到
        //Spring 的容器中
        User user = userObjectProvider.getIfAvailable(User::createUser);
        System.out.println("当前 User 对象：" + user);

    }

    @Bean
    public String helloWorld() {
        return "helloWorld";
    }

    private static void lookupByObjectProvider(AnnotationConfigApplicationContext applicationContext) {
        ObjectProvider<String> beanProvider = applicationContext.getBeanProvider(String.class);
        System.out.println(beanProvider.getObject());
    }
}
