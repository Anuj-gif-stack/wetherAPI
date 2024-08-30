package com.wether.wetherAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class WetherApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WetherApiApplication.class, args);
	}

}
