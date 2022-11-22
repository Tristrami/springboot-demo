package com.seamew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootProfileApplication
{
    // 配置激活环境的三种方式：
    // 1. 在 application.yml 中配置属性 spring.profiles.active 属性
    // 2. 在主程序启动参数中配置 spring.profiles.active 属性
    // (1) 使用 java -jar 命令：java -jar application.jar --spring.profiles.active=dev
    // (2) 在 idea 中运行配置中配置启动参数 spring.profiles.active=dev
    // 3. 在 vm 参数中添加配置 -Dspring.profiles.active=dev
    // 三种方式的优先级：vm 参数 > 主程序参数 > yml 配置
    // 🌟 将项目打包为 jar 包直接用 maven 生命周期插件 package 插件即可，打包好的 jar 包在 target 目录下

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootProfileApplication.class, args);
    }

}
