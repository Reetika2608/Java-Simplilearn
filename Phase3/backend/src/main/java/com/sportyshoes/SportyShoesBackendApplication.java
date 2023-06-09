package com.sportyshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SportyShoesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportyShoesBackendApplication.class, args);
	}
	
	//For Swagger documentation	
	@Bean
	public Docket allApis() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.sportyshoes.restapi"))
				.build();
	}

}//end class
