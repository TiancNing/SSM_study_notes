package com.tianna.mybatis.mapper;

import com.tianna.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author tiancn
 * @date 2022/8/1 15:54
 */
public interface CacheMapper {
    /**
     * 根据员工id查询员工信息
     * @param empId
     * @return
     */
    Emp getEmpById(@Param("empId") Integer empId);
}
