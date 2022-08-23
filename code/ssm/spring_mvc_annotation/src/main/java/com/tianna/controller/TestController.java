package com.tianna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tiancn
 * @date 2022/8/22 17:50
 */
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
