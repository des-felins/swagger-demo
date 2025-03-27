package com.example.openapidemo.dto;

import lombok.Builder;

@Builder
public record NewEmployeeDto(String firstName,
                             String lastName) {
}