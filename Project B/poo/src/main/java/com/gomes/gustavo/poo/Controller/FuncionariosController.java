package com.gomes.gustavo.poo.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gomes.gustavo.poo.entity.Funcionarios;
import com.gomes.gustavo.poo.repository.FuncionarioRepository;

@RestController
@RequestMapping("/api/funcionario")
public class FuncionariosController {
	
	@Autowired
	private FuncionarioRepository repository;
	
	@GetMapping("/find/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Optional<Funcionarios> findById (@PathVariable Integer id) {
		return repository.findById(id);
	}
	
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.OK)
	public void salvarFuncionario(@RequestBody Funcionarios func) {
		Funcionarios funcionario = new Funcionarios(func.getCpf(),func.getEmail(),func.getPhoneNum(), func.getProblemaMedico());
		repository.save(funcionario);	
	}
	
}
