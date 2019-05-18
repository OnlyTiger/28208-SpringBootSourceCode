package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoSingletonService.java
 * @Description: 编写Singleton的Bean
 * @author zhanghu
 * @date 2019年5月19日 上午2:19:12
 */
@Service // 1、默认为Singleton，相当于@Scope("Singleton")。全容器共享一个实例。
public class DemoSingletonService {

}
