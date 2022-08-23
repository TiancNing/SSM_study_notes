package com.tianna.spring.dao.impl;

import com.tianna.spring.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author tiancn
 * @date 2022/8/9 20:33
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功");
    }
}
