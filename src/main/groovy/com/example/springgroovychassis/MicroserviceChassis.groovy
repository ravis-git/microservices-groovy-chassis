package com.example.springgroovychassis

import com.example.springgroovychassis.config.AppConfig
import groovy.util.logging.Slf4j
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableConfigurationProperties(AppConfig)
@Slf4j
@EnableDiscoveryClient
class MicroserviceChassis {

	static void main(String[] args) {
		SpringApplication.run MicroserviceChassis, args
	}
}
