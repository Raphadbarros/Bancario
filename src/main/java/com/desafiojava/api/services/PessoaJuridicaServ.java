package com.desafiojava.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafiojava.api.dto.CadastrarContaDto;
import com.desafiojava.api.entidades.PessoaJuridica;
import com.desafiojava.api.repositories.PessoaJuridicaReposi;

@Service
public class PessoaJuridicaServ {

	
	@Autowired
	private PessoaJuridicaReposi RepositoryPJ;
	
	PessoaJuridica pessoaJ= new PessoaJuridica();
	
	public PessoaJuridica cadastrarPJ(CadastrarContaDto dadosmodel, long idcontas) {
		
		pessoaJ.setId(idcontas);
		pessoaJ.setCnpj(dadosmodel.getCnpj());
		pessoaJ.setNomeFantasia(dadosmodel.getNomeFantasia());
		pessoaJ.setRazaoSocial(dadosmodel.getRazaoSocial());
	    
		return RepositoryPJ.save(pessoaJ);
	}

	
	
}
