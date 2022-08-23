package com.tianna.spring.test;

import com.tianna.spring.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tiancn
 * @date 2022/8/7 21:01
 */
public class LifeCycleTest {
    @Test
    public void test(){
        /*
        * 1、实例化（无参构造器）
        *2、依赖注入
        *3、初始化，需要通过bean的init-method属性指定初始化的方法。
        *4、IOC容器关闭时销毁，需要通过bean的destroy-method属性指定初始化的方法。
        *
        *
        * */
        //ConfigurableApplicationContext是ApplicationContext的子接口，其中扩展了刷新和关闭容器的方法。
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring-lifecycle.xml");
        User user = ioc.getBean(User.class);
        System.out.println(user);
        ioc.close();
    }
}
