package com.fanruice.exercise.spring.bean.factory;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 默认的 User 工厂实现类
 */
public class DefaultUserFactory implements UserFactory, InitializingBean, DisposableBean {

    //1、基于 PostConstruct 注解进行初始化
    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct ：UserFactory 初始化。。。");
    }

    //3、自定义初始化方法
    public void initByBeanInit() {
        System.out.println("自定义初始化方法 ：initByBeanInit 初始化。。。");
    }

    @Override
    public User createUser() {
        return User.createUser();
    }

    //2、实现 InitializingBean 接口的 afterPropertiesSet()方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean ：afterPropertiesSet 初始化。。。");
    }

    //销毁1、@PreDestroy 标注方法
    @PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy ：preDestroy 销毁中。。。");
    }

    //销毁2、实现 DisposableBean 接口的destroy()方法
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean ：destroy 销毁中。。。");
    }

    //销毁3、自定义
    public void doDestroy() {
        System.out.println("自定义 ：doDestroy 销毁中。。。");
    }
}
