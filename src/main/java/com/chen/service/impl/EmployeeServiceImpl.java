package com.chen.service.impl;

import com.chen.dao.IEmployeeDao;
import com.chen.domain.Employee;
import com.chen.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Chen Dian
 * @date 2019/06/18
 */
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private IEmployeeDao employeeDao;

    @Override
    public void save(Employee e) {
        employeeDao.save(e);
    }

    @Override
    public void update(Employee e) {
        employeeDao.update(e);
    }
}
