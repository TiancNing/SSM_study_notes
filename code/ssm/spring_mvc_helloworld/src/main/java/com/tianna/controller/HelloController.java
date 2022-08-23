package com.tianna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tiancn
 * @date 2022/8/17 21:41
 */
@Controller
public class HelloController {
    // @RequestMapping注解：处理请求和控制器方法之间的映射关系
    // @RequestMapping注解的value属性可以通过请求地址匹配请求，/表示的当前工程的上下文路径
    //即localhost:8080/SpringMVC/
    @RequestMapping("/")
    public String protal(){
        //将逻辑视图返回
        return "index";
    }
    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
