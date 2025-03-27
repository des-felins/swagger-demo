package com.example.openapidemo.dto;

import lombok.Builder;

@Builder
public record EmployeeDto(int id,
                          String firstName,
                          String lastName) {
}