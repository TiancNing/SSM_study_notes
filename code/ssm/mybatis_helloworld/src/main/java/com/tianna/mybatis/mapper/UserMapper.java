package com.tianna.mybatis.mapper;

import com.tianna.mybatis.pojo.User;

import java.util.List;

/**
 * @author tiancn
 * @date 2022/7/22 23:13
 */
public interface UserMapper {
    /**
     *添加用户信息
     * @return
     */
    int insertUser();
    /**
     * 修改用户信息
     * @return
     */
    void updateUser();

    /**
     * 删除用户信息
     * @return
     */
    void deleteUser();

    /**
     *根据id查询数据
     * @return
     */
    User getUserById();

    /**
     * 查询所有的用户信息
     * @return
     */
    List<User> getAllUser();

}
