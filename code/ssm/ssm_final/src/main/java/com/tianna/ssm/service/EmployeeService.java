package com.tianna.ssm.service;

import com.github.pagehelper.PageInfo;
import com.tianna.ssm.pojo.Employee;

import java.util.List;

/**
 * @author tiancn
 * @date 2022/8/22 22:47
 */
public interface EmployeeService {
    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工的分页信息
     * @param pageNum
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);

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
    Employee getEmployeeById(Integer id);

    /**
     * 更新员工信息
     * @param employee
     */
    void updateEmployee(Employee employee);

    /**
     * 删除员工信息
     * @param id
     */
    void deleteEmployee(Integer id);
}
