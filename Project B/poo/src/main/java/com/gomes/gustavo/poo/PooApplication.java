package com.gomes.gustavo.poo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.gomes.gustavo.poo.entity.Funcionarios;
import com.gomes.gustavo.poo.repository.FuncionarioRepository;

@SpringBootApplication
public class PooApplication {

	@Bean
	public CommandLineRunner run ( @Autowired FuncionarioRepository repositoy) {
		return arg -> {
			Funcionarios func = Funcionarios.builder().cpf("12345678910").email("Egamsda").phoneNum("123213").build();
			repositoy.save(func);
			
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);
	}

}
