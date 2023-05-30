package ru.tinkoff.edu.config;

import jakarta.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.annotation.Validated;

import java.sql.Connection;

@Validated
@ConfigurationProperties(prefix = "app", ignoreUnknownFields = true)
public record ConfigApp(@NotNull String test) {
    @Bean
    public String test(ConfigApp config) {
        return config.test;
    }



}
