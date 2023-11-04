package br.com.ramonsantos.servicocadastro.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenAPIConfig {
	@Bean
	public OpenAPI publicApi() {
		return new OpenAPI().info(new Info().title("Serviço Cadastro - API")
			.description("Interface para mapear endpoints dos serviços de cadastro para uma aplicação mobile.")
			.version("0.0.1-SNAPSHOT"));
	}
}