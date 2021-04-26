package com.desafiojava.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiojava.api.dto.CadastrarContaDto;
import com.desafiojava.api.entidades.PessoaFisica;
import com.desafiojava.api.repositories.PessoaFisicaReposi;

@Service
public class PessoaFisicaServ {

	@Autowired
	private ContaServ contaserv;

	@Autowired
	private PessoaFisicaReposi RepositoryPF;

	PessoaFisica pessoaF = new PessoaFisica();

	public PessoaFisica cadastrarPF(CadastrarContaDto dadosdto, Long idconta) {

		pessoaF.setId(idconta);
		pessoaF.setNome(dadosdto.getNome());
		pessoaF.setCpf(dadosdto.getCpf());
		pessoaF.setDataNascimento(dadosdto.getDataNascimento());

		return RepositoryPF.save(pessoaF);

	}

}
