package com.fanruice.exercise.DongTaiDaiLi;

/**
 * @description  检测方法执行时间工具类，在任何方法执行前先调用start方法，
 * 执行后调用finish方法，就可以计算出该方法的运行时间，这也是一个最简单的执行
 * 事件检测的工具
 * @author fanruice
 * @date   2018/11/8 20:23
 */
public class MonitorUtil {

    private static ThreadLocal<Long> t1 = new ThreadLocal<Long>();

    public static void start() {
        t1.set(System.currentTimeMillis());
    }

    //结束时打印耗时
    public static void finish(String methodName) {
        long finishTime = System.currentTimeMillis();
        System.out.println(methodName + "方法耗时" + (finishTime - t1.get()) + "ms");
    }
}
