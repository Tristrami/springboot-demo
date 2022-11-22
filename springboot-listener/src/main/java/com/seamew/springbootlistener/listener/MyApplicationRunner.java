package com.seamew.springbootlistener.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyApplicationRunner implements ApplicationRunner
{
    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        // 方法在容器启动后执行
        log.info("MyApplicationRunner.run()");
    }
}
