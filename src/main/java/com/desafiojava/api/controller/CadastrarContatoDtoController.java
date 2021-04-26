package com.desafiojava.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.desafiojava.api.dto.CadastrarContaDto;
import com.desafiojava.api.services.CadastrarContaServ;

import javassist.tools.rmi.ObjectNotFoundException;

@Controller
@RequestMapping("/api/")
public class CadastrarContatoDtoController {

	@Autowired
	private CadastrarContaServ cadastrardtolserv;

	@RequestMapping(value = "/Cadastrar", method = RequestMethod.POST)
	public ResponseEntity<String> CadastrarConta(@RequestBody CadastrarContaDto cadastrarcontadto)
			throws ObjectNotFoundException {
		cadastrardtolserv.criarConta(cadastrarcontadto);
		return ResponseEntity.ok().body("Conta cadastrada com sucesso");

	}

}
