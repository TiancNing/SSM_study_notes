package com.tianna.mybatis.mapper;

import com.tianna.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tiancn
 * @date 2022/7/31 15:26
 */
public interface DynamicSQLMapper {
    /**
     * 根据条件查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 使用choose查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量添加员工信息
     * @param emps
     */
    void insertMoreEmp(@Param("emps") List<Emp> emps);

    /**
     *
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
