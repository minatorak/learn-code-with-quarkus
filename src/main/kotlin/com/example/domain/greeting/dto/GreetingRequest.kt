package com.example.domain.greeting.dto

import com.fasterxml.jackson.annotation.JsonProperty


data class GreetingRequest (
    @JsonProperty("myName")
    val myName: String
)