package com.tianna.mybatis.test;

import com.tianna.mybatis.mapper.SpecialSQLMapper;
import com.tianna.mybatis.pojo.User;
import com.tianna.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author tiancn
 * @date 2022/7/26 22:10
 */
public class SpecialSQLMapperTest {
    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> user = mapper.getUserByLike("a");
        user.forEach(System.out::println);
    }
    @Test
    public void testDeleteMoreUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("4,8");
        sqlSession.close();
    }
    @Test
    public void testgetUserList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out::println);
        sqlSession.close();
    }
    @Test
    public void testinsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null, "zhangsan", "123456", 23, "男", "42343@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
        sqlSession.close();
    }
}
