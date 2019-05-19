package com.wisely.highlight_spring4.ch2.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @ClassName: ProfileConfig.java
 * @Description: 用户配置文件。Profile配置。Profile为在不同环境下使用不同的配置提供了支持。（比如开发环境，生产环境）
 * @author zhanghu
 * @date 2019年5月19日 上午11:50:29
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev") // 1、Profile为dev时，实例化devDemoBean
    public DemoBean devDemoBean() {
        return new DemoBean("from development profile");
    }

    @Bean
    @Profile("prod") // 2、Profile为prod时，实例化prodDemoBean
    public DemoBean prodDemoBean() {
        return new DemoBean("from production profile");
    }

}
