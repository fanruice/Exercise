package com.fanruice.exercise.spring.bean.definition;

import com.fanruice.exercise.spring.ioc.domain.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @Description : BeanDefinition构建示例
 * @Author: fanruice[fan_rc@suixingpay.com]
 * @create: 2020-05-10 23:16
 * @Copyright ©2019 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
public class BeanDefinitionCreationDemo {

    public static void main(String[] args) {
        //1、通过BeanDefinitionBuilder 构建
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(User.class);
        //通过属性设置操作
        beanDefinitionBuilder.addPropertyValue("id", 1);
        beanDefinitionBuilder.addPropertyValue("name", "小马哥");

        //获取 BeanDefinition 实例
        BeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        //beanDefinition 并非 Bean 的终态，可以自定义进行修改

        //2、通过 AbstractBeanDefinition 的一个派生类
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        //设置Bean的类型
        genericBeanDefinition.setBeanClass(User.class);
        //通过 MutablePropertyValues 批量操作属性
        MutablePropertyValues propertyValues = new MutablePropertyValues();
        /*propertyValues.addPropertyValue("id", 1);
        propertyValues.addPropertyValue("name", "小马哥");*/
        propertyValues.add("id", 1)
                .add("name", "小马哥");
        genericBeanDefinition.setPropertyValues(propertyValues);


    }
}
