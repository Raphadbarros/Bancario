package com.desafiojava.api.entidades;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class PessoaFisica {

	
	@Id
	private long id;

	private String Nome;

	private long cpf;

	private Date dataNascimento;

	/*
	 * @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoaFisica") private Conta
	 * conta;
	 */
	public PessoaFisica(long id, String nome, long cpf, Date dataNascimento) {
		super();
		this.id = id;
		Nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		// this.conta = conta;
	}

	public PessoaFisica() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/*
	 * public Conta getConta() { return conta; }
	 * 
	 * public void setConta(Conta conta) { this.conta = conta; }
	 */
}
