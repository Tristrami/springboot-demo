package com.seamew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootConfigApplication
{
    // Springboot 内部配置文件的优先级顺序：
    // 1. file: ./config/ --- 当前项目所在目录的 config 目录下的配置文件
    // 2. file: ./ --- 当前项目所在目录下的配置文件
    // 3. classpath: /config --- 当前项目类路径 config 目录下的配置文件
    // 4. classpath: / --- 当前项目类路径下的配置文件
    // 注意：相同的配置项优先级高的会覆盖优先级低的
    //
    // Springboot 外部配置文件是为了在不改变内部配置的前提下修改一些配置
    // 1. 添加主程序参数来修改配置
    // (1) java -jar app.jar --server.port=9999
    // (2) 通过添加 vm 参数来修改配置
    // 2. 指定外部配置文件路径：java -jar app.jar --spring.config.location=/Users/mac/...
    //
    // 🌟 将项目打包为 jar 包直接用 maven 生命周期插件 package 插件即可，打包好的 jar 包在
    //    target 目录下

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootConfigApplication.class, args);
    }

}
