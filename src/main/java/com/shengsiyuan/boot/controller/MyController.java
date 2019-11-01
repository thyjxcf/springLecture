package com.shengsiyuan.boot.controller;

import com.shengsiyuan.boot.config.MyConfig;
import com.shengsiyuan.boot.config.MyConfigBean;
import com.shengsiyuan.boot.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Designed By luf
 *
 * @author luf
 * @date 2019/11/1 11:17
 */
@RestController
@RequestMapping(value = "/api",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class MyController {
    @Value("${myConfig.myObject.myName}")
    private String myName;
    @Value("${myConfig.myObject.age}")
    private int age;
    @Autowired
    private MyConfigBean myConfigBean;
    @RequestMapping(value = "/person" ,method= RequestMethod.GET)
    public Person getPerson() {
        Person person = new Person();
        person.setId(age);
        person.setName(myName);
        person.setBirthday(new Date());
        System.out.println(myConfigBean.getMyAge());
        System.out.println(myConfigBean.getMyName());

        return person;
    }
}
