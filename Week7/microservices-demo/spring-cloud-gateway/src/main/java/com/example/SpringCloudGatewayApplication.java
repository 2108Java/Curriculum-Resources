package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayApplication.class, args);
	}
	
//	@Bean 
//	public RouteLocator customRouterLocator(RouteLocatorBuilder builder) {
//		 return builder.routes()
//			      .route("r1", r -> r.host("**.baeldung.com")
//			        .and()
//			        .path("/baeldung")
//			        .uri("http://baeldung.com"))
//			      .route(r -> r.host("**.baeldung.com")
//			        .and()
//			        .path("/myOtherRouting")
//			        .filters(f -> f.prefixPath("/myPrefix"))
//			        .uri("http://othersite.com"))
//			    .build();
//	}

}
