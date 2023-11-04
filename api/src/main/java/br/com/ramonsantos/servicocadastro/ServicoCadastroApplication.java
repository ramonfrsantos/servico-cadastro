package br.com.ramonsantos.servicocadastro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class ServicoCadastroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicoCadastroApplication.class, args);
	}

}