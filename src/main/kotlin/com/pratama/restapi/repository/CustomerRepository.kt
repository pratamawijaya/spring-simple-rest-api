package com.pratama.restapi.repository

import com.pratama.restapi.models.Customer
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface CustomerRepository :CrudRepository<Customer,String>{

    @Query("select * from customer")
    fun findCustomers():List<Customer>
}