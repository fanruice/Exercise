package com.fanruice.exercise.Annotation;

/**
 * @description  定义用户类
 * @author fanruice
 * @date   2018/12/27 17:19
 */
public class User {

    @ReqValue(values = "张三")
    private String userName;

    @ReqValue(values = "123")
    private String password;

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
