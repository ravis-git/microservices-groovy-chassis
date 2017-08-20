package com.example.springgroovychassis.ops


import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

/**
 * Created by ravipalakodeti on 8/20/17.
 */
@Path("health")
class HealthApi {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    String health() {
        return '{"name" "spring-chassis", "status": "UP"}'
    }
}
