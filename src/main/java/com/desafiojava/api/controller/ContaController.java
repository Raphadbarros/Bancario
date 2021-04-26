package com.desafiojava.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.desafiojava.api.entidades.Conta;
import com.desafiojava.api.services.ContaServ;

import javassist.tools.rmi.ObjectNotFoundException;




@Controller
@RequestMapping("/Conta")
public class ContaController {


	@Autowired
	private ContaServ contaserv;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?>ContaDados(@PathVariable long id) throws ObjectNotFoundException {
		Conta Response = contaserv.buscarId(id);
		return ResponseEntity.ok().body(Response);
	}



}
