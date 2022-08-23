package com.tianna.controller;

import com.tianna.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author tiancn
 * @date 2022/8/22 20:49
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
}
