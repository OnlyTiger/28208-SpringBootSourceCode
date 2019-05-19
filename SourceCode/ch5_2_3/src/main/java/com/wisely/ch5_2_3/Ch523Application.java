package com.wisely.ch5_2_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 这里不能使用@Controller，要不然找不到视图，会返回404。
@SpringBootApplication
public class Ch523Application {

    public static void main(String[] args) {
        SpringApplication.run(Ch523Application.class, args);
    }

    @RequestMapping("/")
    String home() {
        return "Hello Spring Boot!";
    }
}
