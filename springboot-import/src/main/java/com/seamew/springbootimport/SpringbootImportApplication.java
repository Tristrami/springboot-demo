package com.seamew.springbootimport;

import com.seamew.springbootenableother.config.MyImportBeanDefinitionRegistrar;
import com.seamew.springbootenableother.domain.Role;
import com.seamew.springbootenableother.domain.User;
import com.seamew.springbootimport.config.MyImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Map;

// 1. 导入 bean 到容器中
// @Import(User.class)
// 2. 导入配置类
// @Import(UserConfig.class)
// 3. 导入 ImportSelector 实现类来决定要导入的 bean，spring 用这种方式来自动配置，具体原理是，
// @SpringBootApplication -> @EnableAutoConfiguration -> @Import(AutoConfigurationImportSelector.class)
// 这个 ImportSelector 实现类会读取 spring-boot-test-autoconfigure:2.7.5.META-INF.spring.factories 中需要
// 自动导入的配置类的全限定名称并进行导入，其中就包括很多的常用组件，比如 Redis 的配置类，并且结合 @Conditional 条件注解
// 来判断是否应该创建配置类中的 bean
// @Import(MyImportSelector.class)
// 4. 导入 ImportBeanDefinitionRegistrar 构建 beanDefinition 放到容器中
@Import(MyImportBeanDefinitionRegistrar.class)
@SpringBootApplication
public class SpringbootImportApplication
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootImportApplication.class, args);
        // key: beanName, 这里是 User 类的全限定名称, value: bean
        Map<String, User> users = ctx.getBeansOfType(User.class);
        Map<String, Role> roles = ctx.getBeansOfType(Role.class);
        System.out.println(users);
        System.out.println(roles);
    }
}