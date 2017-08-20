package com.example.springgroovychassis.config

import org.springframework.boot.context.properties.ConfigurationProperties

/**
 * Created by ravipalakodeti on 8/20/17.
 */
@ConfigurationProperties(prefix = 'api', ignoreUnknownFields = true, ignoreInvalidFields = true)
class AppConfig {

    List<String> endpoints
}
