package com.won.boostweb3.mvcexam.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = { "com.won.boostweb3.mvcexam.dao",  "com.won.boostweb3.mvcexam.service"})
@Import({ DBConfig.class })
public class ApplicationConfig {

}
