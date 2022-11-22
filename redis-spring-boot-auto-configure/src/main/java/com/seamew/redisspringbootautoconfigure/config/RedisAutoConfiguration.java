package com.seamew.redisspringbootautoconfigure.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.Jedis;

@Configuration
// 将 RedisProperties 放到容器中
@EnableConfigurationProperties(RedisProperties.class)
public class RedisAutoConfiguration
{
    @Bean
    public Jedis jedis(RedisProperties redisProperties)
    {
        return new Jedis(redisProperties.getHost(), redisProperties.getPort());
    }
}
