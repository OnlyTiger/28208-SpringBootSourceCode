package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * @ClassName: LogAspect.java
 * @Description: 编写切面
 * @author zhanghu
 * @date 2019年5月19日 上午1:57:16
 */
@Aspect // 1、声明是一个切面
@Component // 2、此注解让此切面成为Spring容器管理的Bean
public class LogAspect {

    @Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)") // 3、声明切点
    public void annotationPointCut() {};

    @After("annotationPointCut()") // 4、声明建言，并使用@Pointcut定义的切点
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解拦截 " + action.name()); // 5、通过反射可获得注解上的属性，然后做日志记录相关的操作，下面的相同。
    }

    @Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))") // 6、声明建言，此建言直接使用拦截规则作为参数。
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截," + method.getName());

    }


}
