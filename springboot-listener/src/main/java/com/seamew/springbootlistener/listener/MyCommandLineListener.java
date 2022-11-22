package com.seamew.springbootlistener.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MyCommandLineListener implements CommandLineRunner
{
    @Override
    public void run(String... args) throws Exception
    {
        // 方法在容器启动后执行
        log.info("MyCommandLineListener.run()");
    }
}
