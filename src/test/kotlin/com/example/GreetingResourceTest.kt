package com.example

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import io.restassured.RestAssured.with
import io.vertx.core.json.JsonObject
import jakarta.ws.rs.core.MediaType
import org.hamcrest.CoreMatchers.containsString
import org.junit.jupiter.api.Test

@QuarkusTest
class GreetingResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
            .also {
                val json = JsonObject()
                json.put("myName", "KK")
                it.body(json.toString())
                it.contentType(MediaType.APPLICATION_JSON)
            }
            .`when`().put("/hello")
            .then()
            .statusCode(200)
            .body(containsString("KK"))
    }

}