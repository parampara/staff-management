package com.demo.staffmanagement.dataobjects;

import com.demo.staffmanagement.entities.Employee;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDO {
    private Long id;
    private String name;
    private Float salary;
    private Long managerId;
}

