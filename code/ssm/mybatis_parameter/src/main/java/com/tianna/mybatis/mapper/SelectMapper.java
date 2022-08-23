package com.tianna.mybatis.mapper;

import com.tianna.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author tiancn
 * @date 2022/7/25 22:27
 */
public interface SelectMapper {
    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询用户的总数量
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息为一个map集合
     * @param id
     * @return
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为map集合
     * @return
     */
    /*List<Map<String,Object>> getAllUserToMap();*/
    @MapKey("id")
    Map<String,Object> getAllUserToMap();
}
