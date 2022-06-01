package com.pratama.restapi.services

import com.pratama.restapi.models.Employee
import com.pratama.restapi.repository.EmployeeRepository
import org.springframework.stereotype.Service

@Service
class EmployeeService (private val employeeRepository: EmployeeRepository){

    fun getAll():List<Employee> = employeeRepository.findAll()

    fun create(employee: Employee) :Employee = employeeRepository.save(employee)
}