package com.wisely.highlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // 1 声明当前类是一个配置类。相当于一个SPring配置的xml文件。，可以完全替代xml配置。
@ComponentScan("com.wisely.highlight_spring4.ch1.di") // 2使用此注解，自动扫描包名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为Bean
public class DiConfig {

}
