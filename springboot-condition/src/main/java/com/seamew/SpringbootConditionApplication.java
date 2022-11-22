package com.seamew;

import com.seamew.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class SpringbootConditionApplication
{
    // springboot-autoconfigure 项目中为我们写好了一些常用工具（如 redis、tomcat）的创建逻辑，
    // 只要我们引入了相关的依赖，容器中就会有可用的 bean，例如引入 spring-boot-starter-data-redis
    // 起步依赖，容器中就会有 redisTemplate 这个 bean，实现原理是这样的，在创建这些 bean 的配置
    // 类上，spring 会使用 @ConditionalOnClass 及其他类似的条件注解来控制只有当我们的项目类路径
    // 下有某个可用加载到某个类时，bean 才会被创建，还可能会在 @Bean 方法上使用 @ConditionalOnBean
    // 来控制只用当容器中有某个 bean 时，这个 bean 才会被创建，或者 @ConditionalOnMissingBean
    // 来控制只用当容器中没有有某个 bean 时，这个 bean 才会被创建
    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootConditionApplication.class, args);
        // 只要引入了 spring-boot-starter-data-redis 起步依赖，容器中就会有 redisTemplate 这个 bean
        RedisTemplate<?, ?> redisTemplate = context.getBean("redisTemplate", RedisTemplate.class);
        User user = (User) context.getBean("user");
        User user2 = (User) context.getBean("user2");
        System.out.println(redisTemplate);
        System.out.println(user);
        System.out.println(user2);
    }
}
