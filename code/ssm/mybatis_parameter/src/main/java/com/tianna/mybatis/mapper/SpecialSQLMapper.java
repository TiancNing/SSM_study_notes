package com.tianna.mybatis.mapper;

import com.tianna.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tiancn
 * @date 2022/7/26 17:24
 */
public interface SpecialSQLMapper {
    /**
     * 测试模糊查询
     * @param mohu
     * @return
     */
    List<User> getUserByLike(@Param("mohu") String mohu);

    /**
     * 批量删除
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 动态设置表明，查询用户信息
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);

    /**
     * 添加用户信息并返回主键
     * @param user
     * @return
     */
    int insertUser(User user);
}
