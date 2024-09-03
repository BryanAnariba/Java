package com.bs.web_rest_api;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration()
@PropertySources({
  @PropertySource("classpath:messages.properties")
})
public class AppConfig {
  
}
