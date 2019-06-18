package com.chen.dao.impl;

import com.chen.dao.IEmployeeDao;
import com.chen.domain.Employee;
import org.springframework.stereotype.Repository;

/**
 * @author Chen Dian
 * @date 2019/06/18
 */
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

    @Override
    public void save(Employee e) {
        System.out.println("保存学生信息===");
    }

    @Override
    public void update(Employee e) {
        System.out.println("修改学生信息===");
        throw new RuntimeException("修改出现异常！"); // 模拟异常
    }
}
