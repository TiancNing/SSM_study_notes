package com.tianna.spring.controller;

import com.tianna.spring.service.UserService;

/**
 * @author tiancn
 * @date 2022/8/7 23:55
 */
public class UserController {
    private UserService userService;
    public UserService getUserService() {
        return userService;
    }
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void saveUser(){
        userService.saveUser();
    }
}
