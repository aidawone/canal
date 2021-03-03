package he.aida.cancal.utils;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author: aidawone
 * @Description:
 * @Date: Create in 17:21 2021/3/3
 */
@Component
public class ConstantUtils implements InitializingBean {

    @Value("${cancal.host}")
    private String host;
    @Value("${cancal.port}")
    private Integer port;

    public static String HOST;
    public static Integer PORT;

    @Override
    public void afterPropertiesSet() throws Exception {
        HOST = this.host;
        PORT = this.port;
    }
}
