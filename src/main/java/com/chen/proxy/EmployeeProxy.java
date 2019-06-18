package com.chen.proxy;

import com.chen.domain.Employee;
import com.chen.service.IEmployeeService;
import com.chen.tx.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Chen Dian
 * @date 2019/06/18
 */
@Component("employeeProxy")
public class EmployeeProxy implements IEmployeeService{

    @Autowired
    private IEmployeeService employeeService; // 增强的目标对象

    @Autowired
    private TransactionManager txManager; // 注入事务管理器

    @Override
    public void save(Employee e) {
        txManager.begin();
        try {
            employeeService.save(e);
            txManager.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            txManager.rollback(); // 出现异常回滚事务
        }
    }

    @Override
    public void update(Employee e) {
        txManager.begin();
        try {
            employeeService.update(e);
            txManager.commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            txManager.rollback(); // 出现异常回滚事务
        }
    }

}
