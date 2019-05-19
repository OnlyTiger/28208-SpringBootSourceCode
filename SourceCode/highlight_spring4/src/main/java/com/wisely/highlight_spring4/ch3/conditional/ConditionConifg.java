package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: ConditionConifg.java
 * @Description: 配置类
 * @author zhanghu
 * @date 2019年5月19日 下午2:17:26
 */
@Configuration
public class ConditionConifg {
    @Bean
    @Conditional(WindowsCondition.class) // 1、通过@Conditional注解，符合Windows条件则实例化WindowsListService。
    public ListService windowsListService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class) // 2、通过@Conditional注解，符合linux条件则实例化LinuxListService。
    public ListService linuxListService() {
        return new LinuxListService();
    }

}
