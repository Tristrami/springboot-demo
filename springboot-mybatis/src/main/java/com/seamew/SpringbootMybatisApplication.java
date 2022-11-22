package com.seamew;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.seamew.mapper")
public class SpringbootMybatisApplication
{
    // Springboot 整合 Mybatis 配置步骤：
    // 1. 添加 mybatis-spring-boot-starter 依赖
    // 2. 在 application.yml

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
    }

}
