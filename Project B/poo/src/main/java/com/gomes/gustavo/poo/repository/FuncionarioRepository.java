package com.gomes.gustavo.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gomes.gustavo.poo.entity.Funcionarios;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionarios, Integer>{
}
