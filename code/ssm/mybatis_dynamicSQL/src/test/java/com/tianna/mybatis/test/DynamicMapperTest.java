package com.tianna.mybatis.test;

import com.tianna.mybatis.mapper.DynamicSQLMapper;
import com.tianna.mybatis.pojo.Emp;
import com.tianna.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tiancn
 * @date 2022/7/31 15:36
 */
public class DynamicMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"",null,"");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out::println);
    }
    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"张三",20,"男");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out::println);
    }
    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null,"小明1",21,"男");
        Emp emp2 = new Emp(null,"小明2",22,"女");
        Emp emp3 = new Emp(null,"小明3",23,"男");
        List<Emp> list = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(list);
        sqlSession.close();
    }
    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = new Integer[]{7,8};
        mapper.deleteMoreEmp(empIds);
        sqlSession.close();
    }
}
