package com.tianna.spring.dao.impl;

import com.tianna.spring.dao.UserDao;

/**
 * @author tiancn
 * @date 2022/8/7 23:58
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
