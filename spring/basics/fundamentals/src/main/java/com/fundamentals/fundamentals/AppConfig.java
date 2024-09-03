package com.fundamentals.fundamentals;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration()
@PropertySources({
	@PropertySource(value = "classpath:values.properties", encoding = "UTF-8"),
	// @PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
})
public class AppConfig {

}
