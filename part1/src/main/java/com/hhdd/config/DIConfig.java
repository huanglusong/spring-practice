package com.hhdd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author HuangLusong
 * @Date 2021/4/5 14:10
 */
@Configuration
@ComponentScan("com.hhdd.bean")
@PropertySource(value = {"classpath:/person.properties"})
public class DIConfig {

}
