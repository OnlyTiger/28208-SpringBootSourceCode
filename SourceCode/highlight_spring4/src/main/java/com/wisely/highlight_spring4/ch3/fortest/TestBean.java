package com.wisely.highlight_spring4.ch3.fortest;

/**
 * @ClassName: TestBean.java
 * @Description: 业务代码
 * @author zhanghu
 * @date 2019年5月19日 下午2:56:20
 */
public class TestBean {
    private String content;

    public TestBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
