package com.tianna.spring.controller;

import com.tianna.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author tiancn
 * @date 2022/8/9 20:32
 */
//@Controller("controller")
@Controller
public class UserController {
    /*@Autowired(required = false)*/
    /*@Qualifier("service")*/
    @Autowired
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
