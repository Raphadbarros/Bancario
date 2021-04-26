package com.desafiojava.api.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transacoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private long contaOrigem;
	private long destino;
	private String  descricao;
	private double valor;
	private String tipoTransacao;
	
	public Transacoes() {
		
	}
	
	public Transacoes(long id, long contaOrigem, long destino, String descricao, double valor, String tipoTransacao) {
		super();
		this.id = id;
		this.contaOrigem = contaOrigem;
		this.destino = destino;
		this.descricao = descricao;
		this.valor = valor;
		this.tipoTransacao = tipoTransacao; 
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(long contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public long getDestino() {
		return destino;
	}

	public void setDestino(long destino) {
		this.destino = destino;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(String tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}
	
	
}
