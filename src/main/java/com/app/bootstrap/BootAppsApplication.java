package com.app.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootAppsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootAppsApplication.class, args);
        System.out.println("hello spring boot");
    }
}
