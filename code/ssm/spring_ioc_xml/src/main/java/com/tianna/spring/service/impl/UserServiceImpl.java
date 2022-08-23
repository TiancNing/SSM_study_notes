package com.tianna.spring.service.impl;

import com.tianna.spring.dao.UserDao;
import com.tianna.spring.service.UserService;

/**
 * @author tiancn
 * @date 2022/8/7 23:56
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
