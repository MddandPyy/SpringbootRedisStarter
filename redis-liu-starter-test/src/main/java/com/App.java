package com;

import com.Service.RedisService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author lzp
 * @version V1.0
 * @Classname App
 * @Date 2020/4/1 16:52
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        RedisService service = context.getBean(RedisService.class);
        service.cache();
    }

}
