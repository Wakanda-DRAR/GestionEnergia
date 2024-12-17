package com.example.GestionEnergia;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EnergiaSostenibleApplication {
	public static void main(String[] args) {
		SpringApplication.run(EnergiaSostenibleApplication.class, args);
	}
}

