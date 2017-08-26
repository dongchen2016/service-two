package com.mdd.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by madongdong on 2017/8/24.
 */
@SpringBootApplication
public class ServiceApplication2 {
    public static void main(String[] args) {
        System.setProperty("spring.config.name", "ServiceApplication2");
        SpringApplication.run(ServiceApplication2.class, args);
    }
}
