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
    public void insert(String novoALuno) {
        this.alunoList.add(novoALuno);
    }

}
