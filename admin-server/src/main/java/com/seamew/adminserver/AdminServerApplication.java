package com.seamew.adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication
{
    // 同时启动 admin-server 和 admin-client，访问 admin-server (http://localhost:9000) 即可查看运维图形化界面
    public static void main(String[] args)
    {
        SpringApplication.run(AdminServerApplication.class, args);
    }
}
