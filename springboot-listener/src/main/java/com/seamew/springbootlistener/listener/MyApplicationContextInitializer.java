package com.seamew.springbootlistener.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyApplicationContextInitializer implements ApplicationContextInitializer
{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext)
    {
        // 这个方法在容器刚初始化时执行，可用在容器启动时检查某些需要的资源是否存在
        log.info("MyApplicationContextInitializer.initialize()");
    }
}
