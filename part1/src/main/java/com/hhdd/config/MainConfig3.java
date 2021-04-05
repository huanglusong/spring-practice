package com.hhdd.config;

import com.hhdd.bean.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author HuangLusong
 * @Date 2021/4/5 13:01
 */
@Configuration
@Import({Person.class})
public class MainConfig3 {



}
