package com.ang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
//排除有关类，将之交给mvc进行扫描
@Configuration
@ComponentScan(value = "com.ang",
        excludeFilters = {@ComponentScan.Filter(
                type = FilterType.ANNOTATION,
                classes = {Controller.class})
})
public class SpringConfig {
}
