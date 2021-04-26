package com.desafiojava.api.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.desafiojava.api.entidades.Conta;


@Transactional(readOnly = true)
public interface ContaReposi extends JpaRepository<Conta, Long>{
	
	Conta findById(long id);

}
