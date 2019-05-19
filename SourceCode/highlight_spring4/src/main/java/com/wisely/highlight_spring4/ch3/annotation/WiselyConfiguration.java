package com.wisely.highlight_spring4.ch3.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/***
 * 
 * @ClassName: WiselyConfiguration.java
 * @Description: 示例组合注解
 * @author zhanghu
 * @date 2019年5月19日 下午2:32:41
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration // 1、组合@Configuration元注解
@ComponentScan // 2组合@ComponentScan元注解
public @interface WiselyConfiguration { // 这个名字可以自定义，供在其他类上使用的组合注解。

    String[] value() default {}; // 3、覆盖value参数

}
