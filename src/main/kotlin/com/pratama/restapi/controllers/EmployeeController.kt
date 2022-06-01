package com.pratama.restapi.controllers

import com.pratama.restapi.models.Employee
import com.pratama.restapi.services.EmployeeService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class EmployeeController(private val employeeService: EmployeeService) {

    @GetMapping("/employee")
    fun getAllEmployees(): List<Employee> = employeeService.getAll()

    @PostMapping("/employee")
    fun createEmployee(@RequestBody payload: Employee): Employee = employeeService.create(payload)
}