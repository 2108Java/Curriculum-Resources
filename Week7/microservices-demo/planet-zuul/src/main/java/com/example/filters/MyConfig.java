package com.example.filters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean
	public MyFilter createFilter() {
		return new MyFilter();
	}
}
