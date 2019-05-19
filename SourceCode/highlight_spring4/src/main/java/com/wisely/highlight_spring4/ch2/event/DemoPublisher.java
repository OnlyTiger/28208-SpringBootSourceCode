package com.wisely.highlight_spring4.ch2.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DemoPublisher.java
 * @Description: 事件发布类
 * @author zhanghu
 * @date 2019年5月19日 下午12:47:20
 */
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;// 注入ApplicationContext用来发布事件。

    public void publish(String msg) {
        applicationContext.publishEvent(new DemoEvent(this, msg));// 使用ApplicationContext的publishEvent方法来发布。
    }

}
