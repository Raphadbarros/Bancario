package com.desafiojava.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.desafiojava.api.entidades.Conta;
import com.desafiojava.api.repositories.ContaReposi;

@Service
public class ContaServ {

	@Autowired
	private ContaReposi contareposi;

	Conta response = new Conta();

	@Value("${app.conta.fisica}")
	private int tipocontafisica;

	@Value("${app.conta.juridica}")
	private int tipocontajuridica;

	@Value("${app.valor.saldo.Inicial}")
	private double valorSaldoInicial;

	@Value("${app.status.ativa}")
	private int statusInicial;

	public Conta criarcontaF(Conta conta) {

		conta.setId(conta.getId() + 1);
		conta.setSaldo(valorSaldoInicial);
		conta.setStatus(statusInicial);
		conta.setTipo(tipocontafisica);

		contareposi.save(conta);

		return conta;
	}

	public Conta criarcontaJ(Conta conta) {

		conta.setId(conta.getId() + 1);
		conta.setSaldo(valorSaldoInicial);
		conta.setStatus(statusInicial);
		conta.setTipo(tipocontajuridica);

		contareposi.save(conta);

		return conta;
	}

	public Conta buscarId(long id) {
		return contareposi.findById(id);
	}

	public void salvar(Conta respon) {
		contareposi.save(respon);
	}

}
