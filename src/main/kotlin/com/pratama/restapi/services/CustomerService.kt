package com.pratama.restapi.services

import com.pratama.restapi.models.Customer
import com.pratama.restapi.repository.CustomerRepository
import org.springframework.stereotype.Service

@Service
class CustomerService (val db:CustomerRepository){

    fun getAll():List<Customer> = db.findCustomers()

    fun add(customer: Customer){
        db.save(customer)
    }
}