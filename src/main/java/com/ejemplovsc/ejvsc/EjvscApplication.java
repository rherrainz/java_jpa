package com.ejemplovsc.ejvsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan({"com.delivery.request"})
public class EjvscApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjvscApplication.class, args);
	}

}
