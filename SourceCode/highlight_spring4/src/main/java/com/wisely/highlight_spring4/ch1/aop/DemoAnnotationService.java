package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoAnnotationService.java
 * @Description: 编写使用注解的被拦截类
 * @author zhanghu
 * @date 2019年5月19日 上午1:55:43
 */
@Service
public class DemoAnnotationService {
    @Action(name = "注解式拦截的add操作")
    public void add() {}

}
