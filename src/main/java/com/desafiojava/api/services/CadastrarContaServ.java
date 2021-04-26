package com.desafiojava.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.desafiojava.api.dto.CadastrarContaDto;
import com.desafiojava.api.entidades.Conta;


@Service
public class CadastrarContaServ {

	@Autowired
	private PessoaFisicaServ pessoafisicaserv;

	@Autowired
	private PessoaJuridicaServ pessoajuridicaserv;

	@Autowired
	private ContaServ contaserv;
	
	@Value("${app.conta.fisica}")
	private double contaFisica;

	@Value("${app.conta.juridica}")
	private double contaJuridica;

	Conta conta = new Conta();

	public CadastrarContaDto criarConta(CadastrarContaDto dadosdto) {
		CadastrarContaDto dadosdtos = new CadastrarContaDto(dadosdto.getNome(), dadosdto.getCpf(),
				dadosdto.getDataNascimento(), dadosdto.getCnpj(), dadosdto.getNomeFantasia(),
				dadosdto.getRazaoSocial(), dadosdto.getTipo()

		);

		int tipos = dadosdtos.getTipo();
		if (tipos == contaFisica) {

			contaserv.criarcontaF(conta);
			long idconta = conta.getId();
			pessoafisicaserv.cadastrarPF(dadosdtos, idconta);

		} else if(tipos == contaJuridica){

			contaserv.criarcontaJ(conta);
			long idcontas = conta.getId();
			pessoajuridicaserv.cadastrarPJ(dadosdtos, idcontas);

		}

		return dadosdtos;
	}

}
