package com.tianna.proxy;

import com.tianna.spring.proxy.Calculator;
import com.tianna.spring.proxy.CalculatorImpl;
import com.tianna.spring.proxy.CalculatorStaticProxy;
import com.tianna.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author tiancn
 * @date 2022/8/10 22:21
 */
public class ProxyTest {
    @Test
    public void testProxy(){
        /*CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        proxy.add(1,2);*/
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator)proxyFactory.getProxy();
        proxy.add(1,2);
    }
}
