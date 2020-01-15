package br.com.virtus.classes;

import java.util.List;

public class Medico {

    private int id;
    private String nome;
    private String crm;
    private String especialidade;
    private List<Paciente> pacientes;

    public Medico(String nome, String crm, String especialidade){
        setNome(nome);
        setCrm(crm);
        setEspecialidade(especialidade);
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return this.crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(Paciente paciente) {
        this.pacientes.add(paciente);
    }

}
