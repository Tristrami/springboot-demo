package com.seamew.springbootenableother.config;

import com.seamew.springbootenableother.domain.Role;
import com.seamew.springbootenableother.domain.User;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar
{
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry)
    {
        AbstractBeanDefinition userBeanDefinition = BeanDefinitionBuilder
                .rootBeanDefinition(User.class)
                .getBeanDefinition();
        AbstractBeanDefinition roleBeanDefinition = BeanDefinitionBuilder
                .rootBeanDefinition(Role.class)
                .getBeanDefinition();
        registry.registerBeanDefinition("user", userBeanDefinition);
        registry.registerBeanDefinition("role", roleBeanDefinition);
    }
}