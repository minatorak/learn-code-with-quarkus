package com.example

import com.example.dto.GreetingRequest
import com.example.dto.GreetingResponse
import jakarta.enterprise.inject.build.compatible.spi.Validation
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.PUT
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/hello")
class GreetingResource {

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    suspend fun hello(request: GreetingRequest) = GreetingResponse("Hello ${request.myName} from RESTEasy Reactive")
}