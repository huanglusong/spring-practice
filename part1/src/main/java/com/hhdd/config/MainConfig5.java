package com.hhdd.config;

import com.hhdd.registrar.MyBeanDefinitionRegistrar;
import com.hhdd.selector.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author HuangLusong
 * @Date 2021/4/5 13:01
 */
@Configuration
@Import({MyBeanDefinitionRegistrar.class})
public class MainConfig5 {



}
