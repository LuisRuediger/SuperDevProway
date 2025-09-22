package model;

import java.util.List;

public class Medico extends Pessoa {

    private int crm;
    private String especialidade;
    private boolean efetivo;
    private List<Paciente> pacientes;

    public Medico() {

    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public boolean isEfetivo() {
        return efetivo;
    }

    public void setEfetivo(boolean efetivo) {
        this.efetivo = efetivo;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
}
