package com.tianna.mybatis.test;

import com.tianna.mybatis.mapper.EmpMapper;
import com.tianna.mybatis.pojo.Emp;
import com.tianna.mybatis.pojo.EmpExample;
import com.tianna.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author tiancn
 * @date 2022/8/3 15:59
 */
public class MBGTest {
    @Test
    public void testMBG(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //1、根据主键查询
        //Emp emp = mapper.selectByPrimaryKey(1);
        //2、查询所有数据
        //List<Emp> emps = mapper.selectByExample(null);
        //emps.forEach(System.out::println);
        //3、根据条件查询,
        //EmpExample example = new EmpExample();
        //以and连接
        //example.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThan(18);
        //以or连接
        //example.or().andGenderEqualTo("男");
        //List<Emp> emps = mapper.selectByExample(example);
        //emps.forEach(System.out::println);
        //System.out.println(emp);
        Emp emp = new Emp(1,"小黑",null,"女",null);
        //mapper.updateByPrimaryKey(emp);
        mapper.updateByPrimaryKeySelective(emp);
    }
}
