package seamew.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import seamew.config.PersonConfig;
import seamew.entity.Person;

@RestController
@RequestMapping("hello")
@Slf4j
public class HelloController
{
    @Autowired
    private Environment env;

    @Autowired
    private Person person;

    @Autowired
    private PersonConfig personConfig;

    @GetMapping
    public String hello()
    {
        return "hello";
    }

    @GetMapping("yml")
    public String getYmlProperties()
    {
        // 1. 第一种方式：通过 @Value 注解获取 yml 中配置属性
        log.info("通过 @Value 注解获取 yml 中配置属性：");
        log.info("person.name = [{}]", person.getName());
        log.info("person.age = [{}]", person.getAge());
        log.info("person.defaultAddress = [{}]", person.getDefaultAddress());

        // 2. 第二种方式：通过 Environment 对象获取 yml 中配置属性
        log.info("通过 Environment 对象获取 yml 中配置属性：");
        log.info("person.name = [{}]", env.getProperty("person.name"));
        log.info("person.age = [{}]", env.getProperty("person.age"));
        log.info("person.defaultAddress = [{}]", env.getProperty("person.address[0]"));

        // 3. 第三种方式：通过 @ConfigurationProperties 将 yml 配置文件属性值与 PersonConfig 配置
        // 对象属性值绑定，再从 PersonConfig 对象中获取属性值
        log.info("通过 @ConfigurationProperties 注解获取 yml 中配置属性：");
        log.info("person.name = [{}]", personConfig.getName());
        log.info("person.age = [{}]", personConfig.getAge());
        log.info("person.defaultAddress = [{}]", personConfig.getAddress()[0]);

        return "三种从 yml 配置文件中获取属性值的方法";
    }
}
