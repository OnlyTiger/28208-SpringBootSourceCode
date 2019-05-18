package com.wisely.highlight_spring4.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * @ClassName: ElConfig.java
 * @Description: 配置类
 * @author zhanghu
 * @date 2019年5月19日 上午2:30:19
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.el")
@PropertySource("classpath:com/wisely/highlight_spring4/ch2/el/test.properties") // 7
public class ElConfig {

    @Value("I Love You!") // 1、注入普通字符串
    private String normal;

    @Value("#{systemProperties['os.name']}") // 2、注入操作系统属性
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0 }") // 3、注入表达式结果
    private double randomNumber;

    @Value("#{demoService.another}") // 4、注入其他Bean属性
    private String fromAnother;

    @Value("classpath:com/wisely/highlight_spring4/ch2/el/test.txt") // 5、注入文件资源
    private Resource testFile;

    @Value("http://www.baidu.com") // 6、注入网址资源
    private Resource testUrl;

    // 注意这里使用的是“$”，不是“#”。
    @Value("${book.name}") // 7、注入配置文件，同时，需要@PropertySource注解指定文件位置，若使@value注入，则需要配置一个PropertySourcesPlaceholderConfigurer的Bean
    private String bookName;

    @Autowired
    private Environment environment; // 7

    @Bean // 7、配合第一个“7”的@Value注解的使用。
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }


    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
