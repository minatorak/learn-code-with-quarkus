package com.example.domain.user.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
data class UserLoginRequest(
    @JsonProperty("email")
    val email: String,
    @JsonProperty("password")
    val password: String
)