package com.dcb.departmentsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentsServiceApplication.class, args);
	}

}
