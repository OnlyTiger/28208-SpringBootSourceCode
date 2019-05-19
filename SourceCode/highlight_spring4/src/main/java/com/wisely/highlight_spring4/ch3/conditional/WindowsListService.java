package com.wisely.highlight_spring4.ch3.conditional;

/**
 * @ClassName: WindowsListService.java
 * @Description: Windows下所要创建的Bean的类
 * @author zhanghu
 * @date 2019年5月19日 下午2:20:03
 */
public class WindowsListService implements ListService {

    @Override
    public String showListCmd() {
        return "dir";
    }

}
