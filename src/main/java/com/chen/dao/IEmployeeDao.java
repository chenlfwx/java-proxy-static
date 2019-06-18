package com.chen.dao;

import com.chen.domain.Employee;

/**
 * @author Chen Dian
 * @date 2019/06/18
 */
public interface IEmployeeDao {

    void save(Employee e);

    void update(Employee e);
}
