package com.example.domain.user

import com.example.domain.user.dto.UserLoginRequest
import com.example.domain.user.dto.UserLoginResponse
import io.quarkus.vertx.web.Route
import io.quarkus.vertx.web.Route.HttpMethod

class UserResource {

    @Route(
        path = "/user",
        methods = arrayOf(HttpMethod.PUT),
        produces = arrayOf("application/json")
    )
    fun login (request: UserLoginRequest) : UserLoginResponse? {
        return null
    }

}