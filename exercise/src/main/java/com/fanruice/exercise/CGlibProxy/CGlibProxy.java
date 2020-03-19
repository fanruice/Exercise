package com.fanruice.exercise.CGlibProxy;

import com.fanruice.exercise.DongTaiDaiLi.MonitorUtil;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class CGlibProxy implements MethodInterceptor{

    private Enhancer enhancer = new Enhancer();

    /**
     * @description  被代理的类构造器有参数
     * @param c 对应类的class
     * @param classes 对应的构造器参数类型
     * @param args 对应的构造器参数值
     * @author fanruice
     * @date   2018/11/15 13:48
     */
    public Object getProxy(Class c, Class[] classes, Object[] args) {
        enhancer.setSuperclass(c);// 设置需要创建子类的类
        enhancer.setCallback(this);
        return enhancer.create(classes, args);// 通过字节码技术动态创建子类的实例
    }

    public Object getProxy(Class c) {
        enhancer.setSuperclass(c);// 设置需要创建子类的类
        enhancer.setCallback(this);
        return enhancer.create();// 通过字节码技术动态创建子类的实例
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法开始");
        MonitorUtil.start();
        Object result = methodProxy.invokeSuper(o, objects);
        MonitorUtil.finish(method.getName());
        return  result;
    }
}
