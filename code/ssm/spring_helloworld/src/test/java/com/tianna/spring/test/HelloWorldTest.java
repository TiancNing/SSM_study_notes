package com.tianna.spring.test;

import com.tianna.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tiancn
 * @date 2022/8/5 17:09
 */
public class HelloWorldTest {
    @Test
    public void test(){
        //获取ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取IOC容器中的bean
        //1.根据id获取
        //HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        //2.根据类型获取
        //HelloWorld helloworld = ioc.getBean(HelloWorld.class);
        //3.根据id和类型获取
        HelloWorld helloworld = ioc.getBean("helloworld", HelloWorld.class);
        //调用方法
        helloworld.sayHelo();
    }
}
