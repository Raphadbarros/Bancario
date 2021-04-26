package com.desafiojava.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.desafiojava.api.entidades.Conta;
import com.desafiojava.api.entidades.Transacoes;
import com.desafiojava.api.repositories.TransacoesReposi;

@Service
public class TransacoesServ {

	@Autowired
	private ContaServ contaServ;

	@Autowired
	private TransacoesReposi transacoesReposi;

	@Value("${app.conta.fisica}")
	private double contaFisica;

	@Value("${app.conta.juridica}")
	private double contaJuridica;

	@Value("${app.valor.pessoa.fisica}")
	private double valorPessoaFisica;

	@Value("${app.valor.pessoa.juridica}")
	private double valorPessoaJuridica;

	public Transacoes create(Transacoes transacao) {

		Conta responseD = contaServ.buscarId(transacao.getDestino());
		if (responseD.getTipo() == contaFisica && transacao.getValor() <= valorPessoaFisica) {
			Depositar(transacao, responseD);
			contaServ.salvar(responseD);
			transacoesReposi.save(transacao);
			return transacao;
		} else if (responseD.getTipo() == contaJuridica && transacao.getValor() <= valorPessoaJuridica) {
			Depositar(transacao, responseD);
			contaServ.salvar(responseD);
			transacoesReposi.save(transacao);
			return transacao;
		} else {
			return null;
		}

	}

	public void Depositar(Transacoes transacao, Conta response) {
		response.setSaldo(response.getSaldo() + transacao.getValor());

	}

	public Transacoes transferir(Transacoes transacao) {

		Conta responseOrig = contaServ.buscarId(transacao.getContaOrigem());
		Conta responseDesti = contaServ.buscarId(transacao.getDestino());

		if (responseDesti.getTipo() == contaFisica && transacao.getValor() <= valorPessoaFisica) {

			TransferirT(transacao, responseOrig, responseDesti);
			contaServ.salvar(responseOrig);
			contaServ.salvar(responseDesti);
			transacoesReposi.save(transacao);
			return transacao;

		} else if (responseDesti.getTipo() == contaJuridica && transacao.getValor() <= valorPessoaJuridica) {
			TransferirT(transacao, responseOrig, responseDesti);
			contaServ.salvar(responseOrig);
			contaServ.salvar(responseDesti);
			transacoesReposi.save(transacao);
			return transacao;
		} else {

			return null;
		}

	}

	private void TransferirT(Transacoes transacao, Conta responseOrig, Conta responseDesti) {

		if (responseOrig.getSaldo() >= transacao.getValor()) {
			responseOrig.setSaldo(responseOrig.getSaldo() - transacao.getValor());
			responseDesti.setSaldo(responseDesti.getSaldo() + transacao.getValor());

		}
	}

}
