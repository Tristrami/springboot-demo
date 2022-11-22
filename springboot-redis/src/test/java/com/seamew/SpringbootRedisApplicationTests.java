package com.seamew;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
@Slf4j
class SpringbootRedisApplicationTests
{
    // 给 RedisTemplate 加泛型会找不到 bean
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testOpsForValue()
    {
        redisTemplate.opsForValue().set("name", "Jack");
        log.info("The name is [{}]", redisTemplate.opsForValue().get("name"));
        log.info("The name is [{}]", redisTemplate.boundValueOps("name").get());
    }
}
