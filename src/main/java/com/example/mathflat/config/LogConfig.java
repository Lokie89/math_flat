package com.example.mathflat.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogConfig {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogConfig.class);

    @Before("execution(* com.example.mathflat.controller.*.*(..)) && !@annotation(NoLog)")
    public void printLog(JoinPoint joinPoint) {
        LOGGER.info(joinPoint.getSignature().toString() + " " + Arrays.toString(joinPoint.getArgs()));
    }
}
