package com.example.domain.user.dto

import com.fasterxml.jackson.annotation.JsonProperty
import io.quarkus.runtime.annotations.RegisterForReflection

@RegisterForReflection
data class UserLoginResponse (
    @JsonProperty("userName")
    val username: String,
    @JsonProperty("email")
    val email: String,
    @JsonProperty("token")
    val token: String,
    @JsonProperty("bio")
    val bio: String,
    @JsonProperty("image")
    val image: String
)