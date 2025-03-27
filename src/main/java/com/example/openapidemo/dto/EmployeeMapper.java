package com.example.openapidemo.dto;

import com.example.openapidemo.entity.Employee;
import org.mapstruct.Mapper;

@Mapper(unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE,
        componentModel = "spring")
public class EmployeeMapper {


    public EmployeeDto mapToEmployeeDto(Employee employee) {

        return EmployeeDto.builder()
                .id(employee.getId())
                .lastName(employee.getLastName())
                .firstName(employee.getFirstName()).build();
    }

    public Employee mapToEmployee(EmployeeDto employeeDto) {
        return Employee.builder()
                .id(employeeDto.id())
                .firstName(employeeDto.firstName())
                .lastName(employeeDto.lastName())
                .build();
    }

    public Employee mapToEmployee(NewEmployeeDto employeeDto) {
        return Employee.builder()
                .firstName(employeeDto.firstName())
                .lastName(employeeDto.lastName())
                .build();
    }

}

