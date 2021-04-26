package com.desafiojava.api.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class PessoaJuridica {

	@Id
	private long id;

	private long Cnpj;

	private String razaoSocial;

	private String nomeFantasia;

	/*
	 * @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoaJuridica") private
	 * Conta conta;
	 */
	public PessoaJuridica() {

	}

	public PessoaJuridica(long id, long cnpj, String razaoSocial, String nomeFantasia, Conta conta) {
		super();
		this.id = id;
		Cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		// this.conta = conta;
	}

	public long getCnpj() {
		return Cnpj;
	}

	public void setCnpj(long cnpj) {
		Cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	/*
	 * public Conta getConta() { return conta; }
	 * 
	 * public void setConta(Conta conta) { this.conta = conta; }
	 */
}
