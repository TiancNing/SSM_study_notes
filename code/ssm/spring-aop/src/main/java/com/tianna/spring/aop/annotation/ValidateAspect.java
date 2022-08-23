package com.tianna.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author tiancn
 * @date 2022/8/14 15:36
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {

    @Before("execution(* com.tianna.spring.aop.annotation.CalculatorImpl.*(..))")
    public void beforeMethod(){
        System.out.println("ValidateAspect-->前置通知");
    }
}
