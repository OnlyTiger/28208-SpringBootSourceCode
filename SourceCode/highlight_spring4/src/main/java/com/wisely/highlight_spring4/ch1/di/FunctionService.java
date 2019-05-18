package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

@Service // 1 此注解为声明当前类为Spring管理的Bean，使用其他四个注解都是等效的。
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }

}
