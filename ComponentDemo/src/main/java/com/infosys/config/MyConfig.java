package com.infosys.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.infosys.beans")
// Configures component scanning directives for use with @Configuration classes.
// Spring scans and register @Component classes  we can use @ComponentScan  in configuration classes.
public class MyConfig {
}
