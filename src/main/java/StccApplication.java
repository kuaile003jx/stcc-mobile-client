import com.yuanxin.ssoauth.config.EnableSSOPortalFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableSSOPortalFilter
@SpringBootApplication
@ComponentScan(basePackages={"com.stcc"})
@MapperScan(basePackages="com.stcc.**.dao")
@EnableTransactionManagement
@EnableCaching
@EnableConfigurationProperties
@log4j
public class StccApplication {

    public static void main( String[] args ){
        long startTime = System.currentTimeMillis();
        SpringApplication.run(StccApplication.class, args);
        log.info("蜗牛车队小程序后端,已启动,共花费：{}ms ",(System.currentTimeMillis()-startTime));
    }
}
