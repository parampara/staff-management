package com.demo.staffmanagement.conrollers;

import com.demo.staffmanagement.dataobjects.EmployeeDO;
import com.demo.staffmanagement.entities.Employee;
import com.demo.staffmanagement.services.EmployeeService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value="/create")
    public ResponseEntity<EmployeeDO> createEmployee(@RequestBody EmployeeDO employeeDO){
        log.info("Received request for creating Employee");
        EmployeeDO employeeModel = employeeService.createEmployee(employeeDO);
        return new ResponseEntity<>(employeeModel, HttpStatus.CREATED);
    }

    @GetMapping(value="/view/{employeeId}")
    public ResponseEntity<EmployeeDO> getEmployee(@PathVariable(name="employeeId",required = true) Long employeeId){
        log.info("Received Request for viewing employee");
        EmployeeDO employeeModel = employeeService.getEmployee(employeeId);
        return new ResponseEntity<>(employeeModel, HttpStatus.OK);
    }

}
