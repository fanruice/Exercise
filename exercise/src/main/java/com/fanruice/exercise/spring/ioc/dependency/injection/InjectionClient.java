package com.fanruice.exercise.spring.ioc.dependency.injection;

import com.fanruice.exercise.spring.ioc.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 依赖注入测试
 */
public class InjectionClient {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("META-INF/dependency-injection-context.xml");
        //手动配置
        UserRepository userRepository = (UserRepository) beanFactory.getBean("userRepository");
        System.out.println("userRepository:" + userRepository);

        //自动配置（根据类型注入）
        UserRepository userRepositoryAuto = (UserRepository) beanFactory.getBean("userRepositoryAuto", UserRepository.class);
        System.out.println("userRepositoryAuto:" + userRepositoryAuto);

        //返回结果为false   依赖注入
        System.out.println(userRepositoryAuto.getBeanFactory() == beanFactory);

        //依赖查找（会报错）
        //System.out.println(beanFactory.getBean(BeanFactory.class));

        //输出的为我们的SuperUser对象 ObjectFactory<User>  被注入进来了
        System.out.println(userRepositoryAuto.getUserObjectFactory().getObject());

        //可以看到 ApplicationContext 与当前的 beanFactory 是相等的，返回结果为true。 ObjectFactory<ApplicationContext> 被注入进来了。
        System.out.println(userRepositoryAuto.getApplicationContextObjectFactory().getObject() == beanFactory);

        //最后  我们会发现，依赖注入和依赖查找的来源并不是同一个
    }
}
