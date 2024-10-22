package com.bryan.mvc_web_app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration()
@PropertySources({
  @PropertySource(value = "classpath:values.properties", encoding = "UTF-8") // Ojo con esto inyecto por asi decirlo el archivo creado llamado value.properties
})
public class AppConfig {
    
}
