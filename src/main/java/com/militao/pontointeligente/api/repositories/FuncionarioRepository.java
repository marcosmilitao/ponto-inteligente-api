package com.militao.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.militao.pontointeligente.api.entities.Funcionario;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface FuncionarioRepository  extends JpaRepository<Funcionario, Long>{

	Funcionario findByCpf(String cpf);
	Funcionario findByEmail(String cpf);
	Funcionario findByCpfOrEmail(String cpf, String email);
}
