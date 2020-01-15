package br.com.virtus.classes;

import java.util.Date;

public class Paciente {

    private int id;
    private String nome;
    private String cpf;
    private Date dt_nasc;
    private String email;

    public Paciente(String nome, String cpf, Date dt_nasc, String email){
        setNome(nome);
        setCpf(cpf);
        setDt_nasc(dt_nasc);
        setEmail(email);
    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Date getDt_nasc(){
        return this.dt_nasc;
    }

    public void setDt_nasc(Date data){
        this.dt_nasc = data;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
