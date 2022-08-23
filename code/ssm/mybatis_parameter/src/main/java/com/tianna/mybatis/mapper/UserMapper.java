package com.tianna.mybatis.mapper;

import com.tianna.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author tiancn
 * @date 2022/7/25 10:46
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username,String password);

    /**
     * 通过map参数传递参数
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String,Object> map);

    /**
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     *验证登录，使用@Param注解
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("username") String username, @Param("password") String password);

    /**
     * 验证登录，以List作为参数
     * @param loginInfo
     * @return
     */
    User checkLoginByPList(List<String> loginInfo);
    /**
     * 验证登录，以数组作为参数
     * @param loginInfo
     * @return
     */
    User checkLoginByArray(String[] loginInfo);

}
