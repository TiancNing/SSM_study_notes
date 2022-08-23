package com.tianna.spring.factory;

import com.tianna.spring.pojo.User;
import org.springframework.beans.factory.FactoryBean;


/**
 * @author tiancn
 * @date 2022/8/7 23:03
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
