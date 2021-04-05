package com.hhdd.config;

import com.hhdd.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author HuangLusong
 * @Date 2021/4/5 12:54
 */
@Configuration
public class MainConfig {
    @Bean
    public Person person() {
        return new Person();
    }
}
