package com.bcs.gateway.sisventasgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SisventasGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisventasGatewayApplication.class, args);
	}

}
