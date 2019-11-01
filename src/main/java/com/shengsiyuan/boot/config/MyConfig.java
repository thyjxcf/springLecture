package com.shengsiyuan.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Designed By luf
 * @Configuration 就是配置类，就会将对象注入
 * @author luf
 * @date 2019/11/1 13:54
 */
@Configuration
public class MyConfig {
    //为了表示是spring管辖范围内的一个bean对象
    @Bean
    public MyConfigBean myConfigBean() {
        return new MyConfigBean();
    }
}
