package com.wisely.ch5_2_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: Ch522Application.java
 * @Description: 添加测试控制器。在6.2.2 常规属性配置中有讲到。
 * @author zhanghu
 * @date 2019年5月19日 下午3:17:04
 */
@RestController
@SpringBootApplication // 开启自动配置
public class Ch522Application {

    @Value("${book.author}")
    private String bookAuthor;
    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/")
    String index() {

        return "book name is:" + bookName + " and book author is:" + bookAuthor;
    }

    public static void main(String[] args) {
        SpringApplication.run(Ch522Application.class, args);
    }
}
