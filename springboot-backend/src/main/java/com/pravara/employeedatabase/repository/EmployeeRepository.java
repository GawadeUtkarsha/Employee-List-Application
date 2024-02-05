package com.pravara.employeedatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pravara.employeedatabase.model.Employee;
@Repository                               
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
