package com.seamew.springbootactuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootActuatorApplication
{
    // 运行后访问 localhost:8080/actuator 即可查看应用相关信息
    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootActuatorApplication.class, args);
    }

}
