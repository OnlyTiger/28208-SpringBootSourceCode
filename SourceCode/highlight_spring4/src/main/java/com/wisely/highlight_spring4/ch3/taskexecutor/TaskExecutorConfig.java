package com.wisely.highlight_spring4.ch3.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @ClassName: TaskExecutorConfig.java
 * @Description: 配置类
 * @author zhanghu
 * @date 2019年5月19日 下午1:43:38
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskexecutor")
@EnableAsync // 1、开启异步任务支持
public class TaskExecutorConfig implements AsyncConfigurer {// 2、配置类实现AsyncConfigurer接口并重写getAsyncExecutor方法

    @Override
    public Executor getAsyncExecutor() {// 2、重写getAsyncExecutor方法，并返回一个ThreadPoolTaskExecutor。这样就获得了一个基于线程池TaskExecutor
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }

}
