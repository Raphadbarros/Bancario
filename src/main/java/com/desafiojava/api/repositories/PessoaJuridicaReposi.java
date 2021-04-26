package com.desafiojava.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.desafiojava.api.entidades.PessoaJuridica;

@Transactional(readOnly = true)
public interface PessoaJuridicaReposi extends JpaRepository<PessoaJuridica, Long> {

}
