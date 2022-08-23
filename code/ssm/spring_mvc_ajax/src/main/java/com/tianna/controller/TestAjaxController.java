package com.tianna.controller;

import com.tianna.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * @author tiancn
 * @date 2022/8/21 15:38
 *
 * 1、@RequestBody：将请求体中的内容和控制器方法的形参进行绑定
 * 2、使用@RequestBody注解将json格式的请求参数转换为java对象
 * a、导入jackson的依赖
 * b、在SpeingMVC的配置文件中设置<mvc:annotation-driven/>
 * c、在处理请求的控制器方法的形参位置，直接设置json格式的请求参数要转换的java类型的形参，使用@RequestBody注解标识
 * 3、@ResponseBody：将所标识的控制器方法的返回值作为响应报文的响应体响应到浏览器
 * 4、使用@ResponseBody注解响应浏览器json格式的数据
 * a、导入jackson的依赖
 * b、在SpeingMVC的配置文件中设置<mvc:annotation-driven/>
 * c、将需要转换为json字符串的java对象直接作为控制器方法的返回值，使用@@ResponseBody注解标识控制器方法，就可以将java对象直接转换为json对象，并相应到浏览器。
 *
 *
 * 常用的java对象转换为json的结果
 * 实体类-->json对象
 * map-->json对象
 * list-->json数组
 */
@Controller
/*@RestController*/
public class TestAjaxController {
    @RequestMapping(value = "/test/ajax")
    public void testAjax(Integer id, @RequestBody String requestBody,HttpServletResponse response) throws IOException {
        System.out.println("requestBody:" + requestBody);
        System.out.println("id:" + id);
        response.getWriter().write("hello world");
    }
    /*@RequestMapping(value = "/test/RequestBody/json")
    public void testRequestBody(@RequestBody User user,HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,RequestBody");
    }*/
    @RequestMapping(value = "/test/RequestBody/json")
    public void testRequestBody(@RequestBody Map<String,Object> map, HttpServletResponse response) throws IOException {
        System.out.println(map);
        response.getWriter().write("hello,RequestBody");
    }
    @RequestMapping(value = "/test/ResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "sucess";
    }
    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public User testResponseBodyJson(){
        User user = new User(1001, "admin", "123456", 20, "男");
        return user;
    }
}
