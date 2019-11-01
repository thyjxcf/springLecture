package com.shengsiyuan.boot.domain;

import java.util.Date;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/11/1 11:18
 */
public class Person {
    private int id;
    private String name;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
