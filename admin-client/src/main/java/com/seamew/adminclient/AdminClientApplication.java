package com.seamew.adminclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdminClientApplication
{
    // 同时启动 admin-server 和 admin-client，访问 admin-server (http://localhost:9000) 即可查看运维图形化界面
    // 在需要监控的模块中引入 spring-boot-admin-starter-client, 并在 spring 配置文件中进行监控相关配置，该模块就可以
    // 被 server 端监控
    public static void main(String[] args)
    {
        SpringApplication.run(AdminClientApplication.class, args);
    }
}
