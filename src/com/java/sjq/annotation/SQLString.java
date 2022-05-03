package com.java.sjq.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 该注解的 使用范围是 属性(域) 上
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface SQLString {
    int value() default 0;
    String name() default "";
}