package cn.tedu.jd.show;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//mapper包下所有接口都是MybatisPlus操作数据库的
//接口，这样就不需要在每个接口上加@Mapper注解了
@MapperScan("cn.tedu.jd.show.mapper")
public class JdShowApplication {

    public static void main(String[] args) {
        SpringApplication.run(JdShowApplication.class, args);
    }
}
