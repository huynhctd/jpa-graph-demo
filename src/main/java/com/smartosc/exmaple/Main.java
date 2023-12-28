package com.smartosc.exmaple;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
@Import(com.smartosc.exmaple.config.JpaConfig.class)
@ComponentScan(basePackages = {"com.smartosc.exmaple.*"})
@EntityScan(basePackages = {"com.smartosc.exmaple.domain", "com.smartosc.exmaple.repository"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}