package com.pratama.restapi.repository

import com.pratama.restapi.models.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository :JpaRepository<Employee,Long>