package seamew.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Person
{
    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    @Value("${person.address[0]}")
    private String defaultAddress;
}
