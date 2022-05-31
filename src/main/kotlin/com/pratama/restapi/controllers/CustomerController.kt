package com.pratama.restapi.controllers

import com.pratama.restapi.models.Customer
import com.pratama.restapi.services.CustomerService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController(val service:CustomerService) {

    @GetMapping
    fun index() : List<Customer>{
        return service.getAll()
    }

    @PostMapping
    fun post(@RequestBody customer:Customer){
        service.add(customer)
    }
}