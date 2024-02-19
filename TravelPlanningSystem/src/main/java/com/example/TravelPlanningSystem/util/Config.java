package com.example.TravelPlanningSystem.util;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class Config implements WebMvcConfigurer{
	@Bean
	public OpenAPI swaggerDocOpenApi(){
		Server devserver = new Server();
		devserver.setUrl("localhost:8080");
		devserver.setDescription("Development Server");
		
		Contact co = new Contact();
		co.setEmail("demomail@gmail.com");
		co.setName("devName");
		co.setUrl("../https://github.com");
		
		License ls = new License();
		ls.setName("License");
		ls.setUrl("license providers");
		
		Info in = new Info();
		in.setContact(co);
		in.setLicense(ls);
		in.setDescription("TravelPlanningSystem: Dummy project");
		in.setTermsOfService("https://www.youtube.com/");
		in.setTitle("Travel Planning System");
		in.setVersion("2.0");
		
		OpenAPI op = new OpenAPI();
		op.info(in);
		op.servers(Arrays.asList(devserver));
		return op;
		
		
		
		
		
		
	}

}
