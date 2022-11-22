package com.seamew.config;

import com.seamew.condition.ClassCondition;
import com.seamew.condition.ConditionalOnClass;
import com.seamew.domain.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig
{
    @Bean
    // @Conditional(ClassCondition.class) // 满足条件才创建该对象放在容器中
    @ConditionalOnClass("redis.clients.jedis.Jedis") // 在某个类存在时在创建该对象
    public User user()
    {
        return new User();
    }

    @Bean
    // 当 Environment 中 shouldCreateUser 的值为 true 时才创建 user2
    @ConditionalOnProperty(name = "shouldCreateUser", havingValue = "true")
    public User user2()
    {
        return new User();
    }
}
