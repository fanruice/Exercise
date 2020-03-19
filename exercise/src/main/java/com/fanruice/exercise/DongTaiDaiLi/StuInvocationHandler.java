package com.fanruice.exercise.DongTaiDaiLi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description
 * @author fanruice
 * @date   2018/11/8 20:33
 */
public class StuInvocationHandler<T> implements InvocationHandler{

    private T target;

    public StuInvocationHandler(T target) {
        this.target = target;
    }

    /**
     * @description
     * @param proxy 代表动态代理对象
     * @param method 代表正在执行的方法
     * @param args 代表调用目标方法时传入的实参
     * @author fanruice
     * @date   2018/11/8 20:41
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理执行" + method.getName() + "方法");

        //代理过程中插入检测方法，计算方法耗时
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());
        return result;
    }
}
