package com.wisely.highlight_spring4.ch3.annotation;

/**
 * @ClassName: DemoConfig.java
 * @Description: 配置类。使用@WiselyConfiguration代替@Configuration和@ComponentScan
 * @author zhanghu
 * @date 2019年5月19日 下午2:27:57
 */
@WiselyConfiguration("com.wisely.highlight_spring4.ch3.annotation") // 这个注解的名称是在WiselyConfiguration类中进行自定义的名称。
public class DemoConfig {

}
