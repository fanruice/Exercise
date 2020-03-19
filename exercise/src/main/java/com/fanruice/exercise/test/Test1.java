package com.fanruice.exercise.test;

/**
 * @description 测试
 *
 * @author fan_rc@suixingpay.com
 * @date   2019/5/17 11:06
 */
public class Test1 {
    private int num;
    private String str;

    public Test1(int num) {
        this.num = num;
    }

    public Test1(int num, String str) {
        this(num);
        this.str = str;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize执行");
        super.finalize();
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1(1, "1");
        System.out.println("---");
        new Test1(2, "1");
        System.gc();
    }
}
