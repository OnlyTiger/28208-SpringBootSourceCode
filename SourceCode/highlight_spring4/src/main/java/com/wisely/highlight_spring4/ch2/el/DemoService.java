package com.wisely.highlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @ClassName: DemoService.java
 * @Description: 需被注入的Bean
 * @author zhanghu
 * @date 2019年5月19日 上午2:30:00
 */
@Service
public class DemoService {
    @Value("其他类的属性") // 1
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }

}
