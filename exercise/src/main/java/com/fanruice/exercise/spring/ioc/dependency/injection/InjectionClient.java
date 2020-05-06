package com.fanruice.exercise.spring.ioc.dependency.injection;

import com.fanruice.exercise.spring.ioc.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

/**
 * 依赖注入测试
 */
public class InjectionClient {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/dependency-injection-context.xml");

        // ==== 依赖来源1： 自定义的Bean
        //手动配置
        UserRepository userRepository = (UserRepository) beanFactory.getBean("userRepository");
        System.out.println("userRepository:" + userRepository);

        //自动配置（根据类型注入）
        UserRepository userRepositoryAuto = beanFactory.getBean("userRepositoryAuto", UserRepository.class);
        System.out.println("userRepositoryAuto:" + userRepositoryAuto);

        // ==== 依赖来源2： 内建的依赖 （如：beanFactory）
        //返回结果为false   依赖注入
        //ConfigurableApplicationContext <- ApplicationContext <- BeanFactory
        //
        //BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/dependency-injection-context.xml");
        // 真正用到的BeanFactory 是ConfigurableApplicationContext#getBeanFactory（）方法所得到的的BeanFactory
        // 最根源 取的是   AbstractRefreshableApplicationContext 的 一个 DefaultListableBeanFactory类型的属性beanFactory
        System.out.println(userRepositoryAuto.getBeanFactory() == beanFactory);

        //依赖查找（会报错）
        //System.out.println(beanFactory.getBean(BeanFactory.class));

        //输出的为我们的SuperUser对象 ObjectFactory<User>  被注入进来了
        System.out.println(userRepositoryAuto.getUserObjectFactory().getObject());

        //可以看到 ApplicationContext 与当前的 beanFactory 是相等的，返回结果为true。 ObjectFactory<ApplicationContext> 被注入进来了。
        System.out.println(userRepositoryAuto.getApplicationContextObjectFactory().getObject() == beanFactory);

        //最后  我们会发现，依赖注入和依赖查找的来源并不是同一个

        // ==== 依赖来源3： 容器内建的Bean
        Environment environment = beanFactory.getBean(Environment.class);
        System.out.println("获取 Environment 类型的Bean：" + environment);
    }
}
