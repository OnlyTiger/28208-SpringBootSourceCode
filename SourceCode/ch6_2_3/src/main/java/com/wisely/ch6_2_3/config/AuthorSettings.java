package com.wisely.ch6_2_3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: AuthorSettings.java
 * @Description: 类型安全的配置（基于properties）
 * @author zhanghu
 * @date 2019年5月19日 下午4:23:45
 */
@Component
@ConfigurationProperties(prefix = "author") // 1、通过@ConfigurationProperties加载properties文件内的配置，通过prefix属性指定properties的配置前缀。通过locations指定properties文件的位置，本例中不需要locations
public class AuthorSettings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
