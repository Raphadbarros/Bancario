package com.desafiojava.api.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;

	private double saldo;
	private Date dataCriacaoConta = new Date();
	private int tipo;
	private int status;

	public Conta() {

	}

	public Conta(long id, double saldo, Date dataCriacaoConta, int tipo, int status) {
		super();
		this.id = id;
		this.saldo = saldo;
		this.dataCriacaoConta = dataCriacaoConta;
		this.tipo = tipo;
		this.status = status;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getDataCriacaoConta() {
		return dataCriacaoConta;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

}
