import com.seamew.SpringbootJunitApplication;
import com.seamew.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// 运行测试用例前会先启动容器
@SpringBootTest(classes = SpringbootJunitApplication.class)
@Slf4j
public class UserServiceTest
{
    @Autowired
    private UserService userService;

    @Test
    public void testGetUser()
    {
        log.info("The user is [{}]", userService.getUser());
    }
}
