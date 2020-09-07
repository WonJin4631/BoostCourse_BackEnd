package com.won.boostweb.mvcweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.won.boostweb.mvcweb.dao","com.won.boostweb.mvcweb.service"})
@Import({DBConfig.class})
public class ApplicationConfig {

}
