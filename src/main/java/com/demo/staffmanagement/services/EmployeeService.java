package com.demo.staffmanagement.services;

import com.demo.staffmanagement.dataobjects.EmployeeDO;
import com.demo.staffmanagement.entities.Employee;
import com.demo.staffmanagement.repositories.EmployeeRepository;
import com.demo.staffmanagement.utils.Convertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    Convertor convertor;

    public EmployeeDO createEmployee(EmployeeDO employeeDO){
        Employee employee = convertor.convert2Employee(employeeDO);
        employeeRepository.save(employee);
        employeeDO.setId(employee.getId());
        return employeeDO;
    }

    public EmployeeDO getEmployee(Long employeeId){
        Optional<Employee> employeeOpt = employeeRepository.findById(employeeId);
        return convertor.convert2EmployeeDO(employeeOpt.get());
    }
}
