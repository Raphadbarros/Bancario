package com.desafiojava.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.desafiojava.api.entidades.Transacoes;

@Transactional(readOnly = true)
public interface TransacoesReposi extends JpaRepository<Transacoes, Long> {

}
