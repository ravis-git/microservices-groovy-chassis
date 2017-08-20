package com.example.springgroovychassis.config

import groovy.util.logging.Slf4j
import org.glassfish.jersey.server.ResourceConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

import javax.ws.rs.ApplicationPath

/**
 * Created by ravipalakodeti on 8/20/17.
 */
@Component
@Slf4j
@ApplicationPath('api')
class JerseyConfig extends ResourceConfig {

    private final AppConfig applicationConfig

    @Autowired
    JerseyConfig(final AppConfig appConfig) {

        applicationConfig = appConfig
        appConfig.endpoints.forEach {
            Class<?> serviceApi = Class.forName(it)
            register(serviceApi)
            log.info " registered: ${serviceApi.getName()}"
        }
    }
}
