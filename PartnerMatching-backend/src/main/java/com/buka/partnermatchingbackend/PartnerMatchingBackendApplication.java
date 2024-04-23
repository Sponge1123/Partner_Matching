package com.buka.partnermatchingbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
//开启定时任务
@EnableScheduling
//@EnableRedisHttpSession
public class PartnerMatchingBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartnerMatchingBackendApplication.class, args);
    }

}
