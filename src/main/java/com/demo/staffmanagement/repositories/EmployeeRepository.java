package com.demo.staffmanagement.repositories;

import com.demo.staffmanagement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Optional<Employee> findById(Long employeeId);
}
