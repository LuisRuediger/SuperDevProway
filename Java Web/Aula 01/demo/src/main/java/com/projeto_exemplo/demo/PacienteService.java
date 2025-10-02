package com.projeto_exemplo.demo;

import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    private int codigo = 7;
    private String nome = "Harry";
    private boolean status = false;

    public String obterDadosPaciente() {
        StringBuilder dadosPaciente = new StringBuilder();

        dadosPaciente.append("<h1> Dados do Paciente </h1>");
        dadosPaciente.append("<p>Nome: ").append(this.nome).append("</p>");
        dadosPaciente.append("<p>Código: ").append(this.codigo).append("</p>");
        dadosPaciente.append("<p>Status: ").append(this.status).append("</p>");
        dadosPaciente.append("<br/>");

        if(this.status) {
            dadosPaciente.append("<p>PACIENTE EM ALTA</p>");
        }else {
            dadosPaciente.append("<p>PACIENTE INTERNADO</p>");
        }

        return dadosPaciente.toString();
    }

}
