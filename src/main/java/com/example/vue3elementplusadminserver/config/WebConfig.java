package com.example.vue3elementplusadminserver.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
        "com.example.vue3elementplusadminserver.controller",
        "com.example.vue3elementplusadminserver.service"
})
public class WebConfig {
}
