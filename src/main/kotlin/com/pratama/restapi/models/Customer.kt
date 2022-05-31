package com.pratama.restapi.models

import org.springframework.data.relational.core.mapping.Table

@Table("customer")
data class Customer(val id: String, val firstName: String, val lastName: String, val email: String)