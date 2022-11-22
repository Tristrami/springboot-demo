package com.seamew.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Collection;
import java.util.Map;

public class ClassCondition implements Condition
{
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata)
    {
        // 通过业务逻辑返回 true 或 false 来决定某个 bean 对象是否生成
        // 需求 1: 假设，必须引入 jedis，项目才生成 user 对象
//        try {
//            Class.forName("redis.clients.jedis.Jedis");
//            return true;
//        } catch (ClassNotFoundException e) {
//            return false;
//        }
        try {
            Map<String, Object> attributes = metadata.getAnnotationAttributes(
                    "com.seamew.condition.ConditionalOnClass");
            if (attributes != null) {
                String[] classNames = (String[]) attributes.get("value");
                for (String name : classNames) {
                    Class.forName(name);
                }
            }
            System.out.println(attributes);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
