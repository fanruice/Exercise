package com.fanruice.exercise.spring.bean.factory;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * User 的 {@link org.springframework.beans.factory.FactoryBean} 实现
 */
public class UserFactoryBean implements FactoryBean {


    @Override
    public Object getObject() throws Exception {
        return User.createUser();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
