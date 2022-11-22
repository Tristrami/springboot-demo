package com.seamew.springbootcustomstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import redis.clients.jedis.Jedis;

// 引入自己写的 redis-spring-boot-starter 后容器中就有了 Jedis 对象
// 可用在 application.yml 中配置 host 和 port
@SpringBootApplication
public class SpringbootCustomStarterApplication
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootCustomStarterApplication.class, args);
        Jedis jedis = ctx.getBean(Jedis.class);
        System.out.println(jedis);
    }
}
