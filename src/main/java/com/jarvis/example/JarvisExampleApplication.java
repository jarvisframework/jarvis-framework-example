package com.jarvis.example;

import com.jarvis.framework.bizlog.BizLogService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Doug Wang
 * @since 1.8, 2023-02-09 15:21:40
 */
@SpringBootApplication
public class JarvisExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JarvisExampleApplication.class, args);
        System.out.println("************系统启动完毕************");
    }

    @Bean
    BizLogService bizLogService() {
        // 输出日志到指定位置
        return log -> System.out.println(log);
    }
}
