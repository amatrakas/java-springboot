package com.adreas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableCaching
@SpringBootApplication
@EnableJpaRepositories
//@ComponentScan(basePackages = "com.adreas.services, com.adreas.repo")
public class SpringApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}
