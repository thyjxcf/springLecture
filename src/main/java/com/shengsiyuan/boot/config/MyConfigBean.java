package com.shengsiyuan.boot.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/11/1 13:34
 */
public class MyConfigBean {
    @Value("${myConfig.myObject.myName}")
    private String myName;
    @Value("${myConfig.myObject.age}")
    private int myAge;

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
}
