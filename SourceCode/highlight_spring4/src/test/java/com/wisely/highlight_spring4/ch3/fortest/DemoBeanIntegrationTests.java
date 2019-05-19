package com.wisely.highlight_spring4.ch3.fortest;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // 1、SpringJUnit4ClassRunner在JUnit环境下提供Spring TestContext Framework的功能。
@ContextConfiguration(classes = {TestConfig.class}) // 2、@ContextConfiguration用来加载配置ApplicationContext，其中class属性用来加载配置类。
@ActiveProfiles("prod") // 3、@ActiveProfiles用来声明活动的prifile。切换prod为dev，则测试不通过。
public class DemoBeanIntegrationTests {
    @Autowired // 4
    private TestBean testBean; // 注入Bean

    @Test // 5
    public void prodBeanShouldInject() {
        String expected = "from production profile"; // @ActiveProfiles("prod")的时候可以通过。
        // String expected = "from development profile"; // @ActiveProfiles("dev")的时候可以通过。
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }


}
