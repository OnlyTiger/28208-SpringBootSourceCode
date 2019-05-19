package com.wisely.highlight_spring4.ch3.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AwareService.java
 * @Description: Spring Aware演示Bean
 * @author zhanghu
 * @date 2019年5月19日 下午1:19:32
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {// 1、实现这两个接口，获得Bean名称和资源就下载的服务

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {// 2、实现ResourceLoaderAware需要重写setResourceLoader
        this.loader = resourceLoader;
    }

    @Override
    public void setBeanName(String name) {// 3、实现BeanNameAware需要重写setBeanName
        this.beanName = name;
    }

    public void outputResult() {
        System.out.println("Bean的名称为：" + beanName);

        Resource resource = loader.getResource("classpath:com/wisely/highlight_spring4/ch3/aware/test.txt");
        try {

            System.out.println("ResourceLoader加载的文件内容为: " + IOUtils.toString(resource.getInputStream()));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
