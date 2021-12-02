package com.demo.staffmanagement.utils;

import com.demo.staffmanagement.dataobjects.EmployeeDO;
import com.demo.staffmanagement.entities.Employee;
import org.springframework.stereotype.Component;

@Component
public class Convertor {

    public Employee convert2Employee(EmployeeDO employeeDO){
        return Employee.builder().name(employeeDO.getName()).salary(employeeDO.getSalary()).build();
    }

    public EmployeeDO convert2EmployeeDO(Employee employee){
        return EmployeeDO.builder().name(employee.getName()).id(employee.getId()).salary(employee.getSalary()).build();
    }
}
