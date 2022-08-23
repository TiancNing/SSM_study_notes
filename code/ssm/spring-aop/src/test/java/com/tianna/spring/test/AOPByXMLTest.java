package com.tianna.spring.test;

import com.tianna.spring.aop.xml.Calculator;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tiancn
 * @date 2022/8/14 18:12
 */
public class AOPByXMLTest {
    @Test
    public void testAOPByXML(){
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-xml.xml");
        Calculator calculator= ioc.getBean(Calculator.class);
        calculator.add(1,1);
    }
}
