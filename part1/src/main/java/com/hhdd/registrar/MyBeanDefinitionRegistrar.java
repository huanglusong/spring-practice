package com.hhdd.registrar;

import com.hhdd.bean.Person;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author HuangLusong
 * @Date 2021/4/5 13:18
 */
public class MyBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean res = registry.containsBeanDefinition("person");
        if (!res) {
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
            registry.registerBeanDefinition("person", beanDefinition);
        }
    }
}
