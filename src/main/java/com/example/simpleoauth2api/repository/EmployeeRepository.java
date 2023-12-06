package com.example.simpleoauth2api.repository;

import com.example.simpleoauth2api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
