package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // 1
public class UseFunctionService {
    @Autowired // 2 通过此注解，把FunctionService的实体Bean注入到当前类UseFunctionService中
    FunctionService functionService;

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }

}
