package com.gomes.gustavo.poo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_func")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Funcionarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String cpf;
	
	@Column
	private String email;
	
	@Column
	private String phoneNum;
	
	@Column
	private String problemaMedico;
	
	
	public Funcionarios(String cpf, String email, String phoneNum,String problemaMedico) {
		this.cpf = cpf;
		this.email = email;
		this.phoneNum = phoneNum;
		this.problemaMedico = problemaMedico;
	}
	
}
