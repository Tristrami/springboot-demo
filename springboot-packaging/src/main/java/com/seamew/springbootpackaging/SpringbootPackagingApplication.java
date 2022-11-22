package com.seamew.springbootpackaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPackagingApplication
{
    // springboot 内嵌了 tomcat，打包直接使用 maven 工具打包成 jar 包即可，生成的
    // jar 包在 target 目录下，我们把 jar 包及配置文件一并给到运维即可，使用 java jar
    // 命令就可以运行 jar 包
    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootPackagingApplication.class, args);
    }
}
