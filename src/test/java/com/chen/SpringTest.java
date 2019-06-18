package com.chen;

import com.chen.domain.Employee;
import com.chen.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Chen Dian
 * @date 2019/06/18
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class SpringTest {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private IEmployeeService employeeProxy;

    @Test
    public void testSpring() {
        for (String str : context.getBeanDefinitionNames()) {
            System.out.println(str);
        }
    }

    @Test
    public void testSave() {
        employeeProxy.save(new Employee());
    }

    @Test
    public void testUpdate(){
        employeeProxy.update(new Employee());
    }
}
