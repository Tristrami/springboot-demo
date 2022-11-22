package com.seamew.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE}) // 注解能放在哪
@Retention(RetentionPolicy.RUNTIME) // 注解什么时候起作用
@Documented // 生成 Javadoc
@Conditional(ClassCondition.class)
public @interface ConditionalOnClass
{
    String[] value(); // 注解参数
}
