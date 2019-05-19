package com.wisely.highlight_spring4.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoService.java
 * @Description: 演示服务Bean
 * @author zhanghu
 * @date 2019年5月19日 下午2:27:33
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得的bean");
    }

}
