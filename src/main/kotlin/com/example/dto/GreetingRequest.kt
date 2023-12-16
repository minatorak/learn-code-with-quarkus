package com.example.dto

import com.fasterxml.jackson.annotation.JsonProperty


data class GreetingRequest (
    @JsonProperty("myName")
    val myName: String
)