package com.fanruice.exercise.spring.ioc.repository;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

import java.util.Collection;

/**
 * 用户的信息仓库
 */
public class UserRepository {

    private Collection<User> users; //自定义导入Bean

    private BeanFactory beanFactory; //内建的非Bean对象（依赖）

    private ObjectFactory<User> userObjectFactory;

    private ObjectFactory<ApplicationContext> applicationContextObjectFactory;

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public ObjectFactory<User> getUserObjectFactory() {
        return userObjectFactory;
    }

    public void setUserObjectFactory(ObjectFactory<User> userObjectFactory) {
        this.userObjectFactory = userObjectFactory;
    }

    public ObjectFactory<ApplicationContext> getApplicationContextObjectFactory() {
        return applicationContextObjectFactory;
    }

    public void setApplicationContextObjectFactory(ObjectFactory<ApplicationContext> applicationContextObjectFactory) {
        this.applicationContextObjectFactory = applicationContextObjectFactory;
    }

    @Override
    public String toString() {
        return "UserRepository{" +
                "users=" + users +
                '}';
    }
}
