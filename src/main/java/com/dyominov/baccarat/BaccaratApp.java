package com.dyominov.baccarat;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dyominov.baccarat.*")
public class BaccaratApp {

    public static void main(String[] args) {
        SpringApplication.run(BaccaratApp.class, args);
    }
}
