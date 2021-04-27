package com.desafiojava.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.desafiojava.api.entidades.Transacoes;
import com.desafiojava.api.services.TransacoesServ;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@RequestMapping("Transacoes")
public class TransacoesCotroller {

	@Autowired
	private TransacoesServ transacoesserv;

	@RequestMapping(value = "/Depositar", method = RequestMethod.POST)
	public ResponseEntity<String> Depositar(@RequestBody Transacoes transacoes) throws ObjectNotFoundException {

		if (transacoes.getValor() <= 0 && transacoes.getContaOrigem() != transacoes.getDestino()) {
			ResponseEntity<String> response = ResponseEntity.ok().body("Valor invalido");
			return response;
		} else {
			transacoesserv.create(transacoes);
			ResponseEntity<String> response = ResponseEntity.ok().body("Deposito efetuado com sucesso");
			if(response == null) {
				response = ResponseEntity.ok().body("Não foi possivel efetuar o Deposito ");
			}
			return response;
		}

	}

	@RequestMapping(value = "/Transferir", method = RequestMethod.POST)
	public ResponseEntity<String> Transferir(@RequestBody Transacoes transacoes) throws ObjectNotFoundException {
		if (transacoes.getValor() <= 0 && transacoes.getContaOrigem() != transacoes.getDestino()) {
			ResponseEntity<String> response = ResponseEntity.ok().body("Valor invalido");
			return response;
		} else {
			transacoesserv.transferir(transacoes);
			ResponseEntity<String> response = ResponseEntity.ok().body("Transferencia efetada com sucesso");
			if(response == null) {
				response = ResponseEntity.ok().body("Não foi possivel efetuar a Transferencia");
			}
			return response;
		}

	}

}
