package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName: AopConfig.java
 * @Description: 配置类
 * @author zhanghu
 * @date 2019年5月19日 上午2:05:36
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch1.aop")
@EnableAspectJAutoProxy // 1、开始Spring对AspectJ的支持。
public class AopConfig {

}
