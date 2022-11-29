package com.workshop.configserver.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("microservice-one")
public class Configuration {
    private String value;
}
