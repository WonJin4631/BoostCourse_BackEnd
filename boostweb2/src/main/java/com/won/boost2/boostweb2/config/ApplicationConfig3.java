package com.won.boost2.boostweb2.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.won.boost2.boostweb2.dao"})
@Import({DBConfig.class})
public class ApplicationConfig3 {

}
