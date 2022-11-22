package seamew.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonConfig
{
    private String name;
    private int age;
    private String[] address;
}
