package com.example.springgroovychassis.rest

import org.springframework.stereotype.Component

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * Created by ravipalakodeti on 8/20/17.
 */
@Component
@Path('/hello')
class ChassisApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path('')
    String appStatus() {
        return '{"name" "spring-chassis", "status": "UP"}'
    }
}
