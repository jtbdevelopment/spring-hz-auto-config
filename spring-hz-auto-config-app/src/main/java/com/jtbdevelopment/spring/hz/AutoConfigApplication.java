package com.jtbdevelopment.spring.hz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * Date: 6/13/2020
 * Time: 11:03 PM
 */
@SpringBootApplication(scanBasePackages = "com.jtbdevelopment.spring")
@EnableCaching
public class AutoConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(AutoConfigApplication.class, args);
    }
}
