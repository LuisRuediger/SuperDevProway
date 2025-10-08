package com.superdev.api.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {

    // Simular o armazenamento do Banco de dados
    private List<String> alunoList = new ArrayList<>();

    // Métod para retornar todos os elementos da lista
    public List<String> getAll() {
        return this.alunoList;
    }

    // Métod para adicionar um elemento a lista
    public String insert(String novoALuno) {
        if (this.alunoList.contains(novoALuno)) {
            return "Erro ao cadastrar aluno: " +
                    novoALuno +" já existe dentro da lista";
        } else {
            this.alunoList.add(novoALuno);
            return "Sucesso! " +
                    novoALuno +" foi inserido na lista";
        }
    }

}
