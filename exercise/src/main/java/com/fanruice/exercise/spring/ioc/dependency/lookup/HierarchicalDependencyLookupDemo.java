package com.fanruice.exercise.spring.ioc.dependency.lookup;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.HierarchicalBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 层次性的依赖查找示例
 */
public class HierarchicalDependencyLookupDemo {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.register(ObjectProviderDemo.class);

        //获取 HierarchicalBeanFactory
        // HierarchicalBeanFactory <- ConfigurableBeanFactory <- ConfigurableListableBeanFactory
        ConfigurableListableBeanFactory beanFactory = applicationContext.getBeanFactory();
        System.out.println("当前 BeanFactory 的 parent BeanFactory：" + beanFactory.getParentBeanFactory());

        BeanFactory parentBeanFactory = createBeanFactory();
        beanFactory.setParentBeanFactory(parentBeanFactory);
        System.out.println("当前 BeanFactory 的 parent BeanFactory：" + beanFactory.getParentBeanFactory());

        //当前 Bean  应该是不包含 User 对象的
        displayLocalBean(beanFactory, "user");
        //父BeanFactory 应该是包含 User 对象的
        displayLocalBean((HierarchicalBeanFactory) parentBeanFactory, "user");

        //递归查找  会发现都为 true   跟 java 的 双亲委派 非常的相似
        displayContainsBean(beanFactory, "user");
        displayContainsBean((HierarchicalBeanFactory) parentBeanFactory, "user");

        applicationContext.refresh();


        applicationContext.close();
    }

    private static BeanFactory createBeanFactory() {
        //创建 BeanFactory 容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        //XML配置文件路径
        String  location = "META-INF/dependency-lookup-context.xml";
        //加载配置
        reader.loadBeanDefinitions(location);
        return beanFactory;
    }

    private static void displayLocalBean(HierarchicalBeanFactory beanFactory, String beanName) {
        System.out.println("当前 BeanFactory 是否包含 localBean：" + beanFactory.containsLocalBean(beanName));

    }

    private  static  void displayContainsBean(HierarchicalBeanFactory beanFactory, String beanName) {
        System.out.println("当前 BeanFactory 是否包含 Bean：" + containsBean(beanFactory, beanName));

    }

    private static boolean containsBean(HierarchicalBeanFactory beanFactory, String beanName) {
        BeanFactory parentBeanFactory = beanFactory.getParentBeanFactory();
        if (parentBeanFactory instanceof HierarchicalBeanFactory) {
            HierarchicalBeanFactory parenthierarchicalBeanFactory = (HierarchicalBeanFactory) parentBeanFactory;
            return containsBean(parenthierarchicalBeanFactory, beanName);
        }
        return beanFactory.containsLocalBean(beanName);
    }
}
