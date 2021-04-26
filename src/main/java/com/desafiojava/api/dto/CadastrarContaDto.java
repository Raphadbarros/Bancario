package com.desafiojava.api.dto;

import java.util.Date;

public class CadastrarContaDto {

	private String Nome;

	private long cpf;

	private Date dataNascimento;

	private long Cnpj;

	private String razaoSocial;

	private String nomeFantasia;

	private int tipo;

	public String getNome() {
		return Nome;
	}

	public CadastrarContaDto(){
		
	}


	public CadastrarContaDto(String nome, long cpf, Date dataNascimento, long cnpj, String razaoSocial,
			String nomeFantasia, int tipo) {
		super();
		Nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		Cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.tipo = tipo;
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
