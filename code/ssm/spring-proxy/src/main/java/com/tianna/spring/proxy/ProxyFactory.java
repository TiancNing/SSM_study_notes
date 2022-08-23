package com.tianna.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author tiancn
 * @date 2022/8/10 22:33
 */

/**
 * 动态代理有两种：
 *  1、jdk动态代理，要求必须有接口，最终生成的代理类和目标类实现相同的接口
 *  在com.sun.proxy包下，类名为$proxy2
 *  2、cglib动态代理，最终生成的代理类会继承目标类，并且和目标类在相同的包下。
 */
public class ProxyFactory {
    //目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    public Object getProxy(){
        /**
         * ClassLoader loader:指定加载动态生成的代理类的类加载器
         * Class<?>[] interfaces,获取目标对象实现的所有接口的class对象的数组。
         * InvocationHandler h:设置代理类中的抽象方法如何重写
         */
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //proxy:代理对象;method:表示要执行的方法;args:表示要执行的方法的参数列表
                Object result = null;
                try {
                    System.out.println("[日志] 方法：" + method.getName() + "参数：" + Arrays.toString(args));
                    //执行目标对象的方法
                    result = method.invoke(target, args);
                    System.out.println("[日志] 方法：" + method.getName() + " 结果：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("[日志] 方法：" + method.getName() + " 异常：" + e);
                }  finally {
                    System.out.println("[日志] 方法：" + method.getName() + "方法执行完毕");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader,interfaces,h);
    }
}
