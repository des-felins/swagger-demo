package com.example.openapidemo.repository;

import com.example.openapidemo.entity.Employee;
import org.springframework.data.repository.ListCrudRepository;

public interface EmployeeRepository extends ListCrudRepository<Employee, Integer> {
}
