package com.desafiojava.api.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.desafiojava.api.entidades.PessoaFisica;


@Transactional(readOnly = true)
public interface PessoaFisicaReposi extends JpaRepository<PessoaFisica, Long>{

		
	
}
