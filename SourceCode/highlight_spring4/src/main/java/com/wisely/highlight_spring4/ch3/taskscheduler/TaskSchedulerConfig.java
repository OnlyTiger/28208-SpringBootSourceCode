package com.wisely.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @ClassName: TaskSchedulerConfig.java
 * @Description: 配置类
 * @author zhanghu
 * @date 2019年5月19日 下午2:00:14
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskscheduler")
@EnableScheduling // 1、开启计划任务支持
public class TaskSchedulerConfig {

}
