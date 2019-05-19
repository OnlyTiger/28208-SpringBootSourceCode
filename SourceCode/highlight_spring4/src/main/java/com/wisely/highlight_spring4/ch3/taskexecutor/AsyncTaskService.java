package com.wisely.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AsyncTaskService.java
 * @Description: 任务执行类
 * @author zhanghu
 * @date 2019年5月19日 下午1:43:49
 */
@Service
public class AsyncTaskService {

    @Async // 1、表明该方法是一个异步方法，如果注解在类级别上，则表明该类所有的方法都是异步方法。
    public void executeAsyncTask(Integer i) {
        System.out.println("ִ执行异步任务: " + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("ִ执行异步任务+1: " + (i + 1));
    }

}
