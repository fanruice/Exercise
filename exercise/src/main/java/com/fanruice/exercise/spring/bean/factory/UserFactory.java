package com.fanruice.exercise.spring.bean.factory;

import com.fanruice.exercise.spring.ioc.domain.User;

/**
 * User 工厂类
 */
public interface UserFactory {

    public User createUser();

}
