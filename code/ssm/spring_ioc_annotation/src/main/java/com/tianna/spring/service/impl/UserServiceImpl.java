package com.tianna.spring.service.impl;

import com.tianna.spring.dao.UserDao;
import com.tianna.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author tiancn
 * @date 2022/8/9 20:32
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    /*@Qualifier("dao")*/
    private UserDao userDao;

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
