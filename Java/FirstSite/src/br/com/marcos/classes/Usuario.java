package br.com.marcos.classes;

import java.util.Date;

public class Usuario {
	
	private String nome;
	private String cpf;
	private Date data_nasc;
	private String email;
	private Sec senha;
	
	public Usuario(String nome, String cpf, Date dt, String email, Sec senha) {
		this.setNome(nome);
		this.setCPF(cpf);
		this.setDataNasc(dt);
		this.setEmail(email);
		this.setSenha(senha);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCPF() {
		return this.cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	
	public Date getDataNasc(Date data) {
		return this.data_nasc;
	}
	
	public void setDataNasc(Date dt) {
		this.data_nasc = dt;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Sec getSenha() {
		return this.senha;
	}
	
	public void setSenha(Sec senha) {
		this.senha = senha;
	}
	
	
	
	
}

