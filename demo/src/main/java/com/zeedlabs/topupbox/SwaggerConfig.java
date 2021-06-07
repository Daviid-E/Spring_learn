package com.zeedlabs.topupbox;

import javax.persistence.Basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	    @Bean
	    public Docket api() {
	        return new Docket(DocumentationType.SWAGGER_2)
	                .useDefaultResponseMessages(false)
	                .select()
	                .apis(RequestHandlerSelectors.basePackage("com.zeedlabs.topupbox.controllers"))
	              
	                .build()
	                //.pathMapping("/")
	                .apiInfo(apiInfo());
	    }
	    private ApiInfo apiInfo() {
	        String apiName = "Topupbox airtime and data vending app";
	        String description = "Our API provides an opportunity for easy airtime/data vending, transaction management/mapping, product set up and delivery";
	        String version = "1.1";
	        String tosUrl = "urn:tos";
	        String license = "Topupbox 1.1";
	        String licenseUrl = "";
	        ApiInfo apiInfo = new ApiInfo(
	                apiName, description, version, tosUrl, "Zeedlabs Technical team support@zeedlabs.com", license, licenseUrl
	        );
	        return apiInfo;
	    }
	
	

}
