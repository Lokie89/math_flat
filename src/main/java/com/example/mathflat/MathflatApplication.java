package com.example.mathflat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class MathflatApplication {

    public static void main(String[] args) {
        SpringApplication.run(MathflatApplication.class, args);
    }

}
