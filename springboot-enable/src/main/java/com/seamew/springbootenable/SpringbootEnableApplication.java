package com.seamew.springbootenable;

import com.seamew.springbootenableother.config.EnableUser;
import com.seamew.springbootenableother.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
// 这个注解相当于在这里加上了 Import(UserConfig.class) 引入了第三方配置类来生成
// 相关的 bean，需要这么做是因为，springboot 在启动时只会扫描本包及子包下的 bean，
// 第三方的 @Configuration 配置类对于本项目来说是不可见的，需要手动导入，但是如果
// 使用 @Import 进行导入，我们需要知道配置类的类名，显然会很麻烦，所以需要第三方 jar
// 包的开发者开发相应的注解，在注解上使用 @Import 导入相应的配置类，我们只需要在这里
// 使用这个注解即可，不需要关心第三方的配置类具体是什么
@EnableUser
public class SpringbootEnableApplication
{
    public static void main(String[] args)
    {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootEnableApplication.class, args);
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
