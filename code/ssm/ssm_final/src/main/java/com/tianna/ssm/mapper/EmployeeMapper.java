package com.tianna.ssm.mapper;

import com.tianna.ssm.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tiancn
 * @date 2022/8/22 22:57
 */
public interface EmployeeMapper {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 添加员工信息
     * @param employee
     */
    void insertEmployee(Employee employee);

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    Employee getEmployeeById(@Param("id") Integer id);

    /**
     * 修改员工信息
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 删除员工信息
     * @param id
     */
    void deleteEmployee(@Param("id") Integer id);
}
