package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoPrototypeService.java
 * @Description: 编写prototype的Bean
 * @author zhanghu
 * @date 2019年5月19日 上午2:18:52
 */
@Service
@Scope("prototype") // 1、声明Scope为prototype。意为每次调用先建一个Bean的实例。
public class DemoPrototypeService {

}
