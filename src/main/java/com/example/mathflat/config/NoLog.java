package com.example.mathflat.config;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE})
public @interface NoLog {
}
