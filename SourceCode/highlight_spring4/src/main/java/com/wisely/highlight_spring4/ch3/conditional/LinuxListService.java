package com.wisely.highlight_spring4.ch3.conditional;

/**
 * @ClassName: LinuxListService.java
 * @Description: Linux下所要创建的Bean的类
 * @author zhanghu
 * @date 2019年5月19日 下午2:19:13
 */
public class LinuxListService implements ListService {

    @Override
    public String showListCmd() {
        return "ls";
    }

}
