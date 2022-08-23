package com.tianna.mybatis.test;

import com.tianna.mybatis.mapper.UserMapper;
import com.tianna.mybatis.pojo.User;
import com.tianna.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tiancn
 * @date 2022/7/25 15:29
 */
public class ParameterTest {
    @Test
    public void testGetUserByUsername(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testCheckLogin(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin", "123456");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testCheckLoginByMap(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","admin");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testInsertUser(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "a123", "123456", 19, "女", "123450@qq.com");
        mapper.insertUser(user);
        sqlSession.close();
    }
    @Test
    public void testCheckLoginByParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admin","123456");
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testCheckLoginByList(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<String> list = new ArrayList<>();
        list.add("admin");
        list.add("123456");
        User user = mapper.checkLoginByPList(list);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void testCheckLoginByArray(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String[] array1 = {"admin","123456"};
        User user = mapper.checkLoginByArray(array1);
        System.out.println(user);
        sqlSession.close();
    }
}
