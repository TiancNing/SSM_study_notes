package com.tianna.spring.test;

import com.tianna.spring.pojo.Clazz;
import com.tianna.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tiancn
 * @date 2022/8/5 17:25
 */
public class IOCByXMLTest {
    @Test
    public void testIOC(){
        //获取IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        //获取bean
        Student studentOne = (Student) ioc.getBean("studentOne");
        System.out.println(studentOne);
    }
    @Test
    public void testDI(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentOne = ioc.getBean("studentEight",Student.class);
        System.out.println(studentOne);
        /*Clazz clazz = ioc.getBean("clazzTwo2", Clazz.class);
        System.out.println(clazz);*/
    }

}
