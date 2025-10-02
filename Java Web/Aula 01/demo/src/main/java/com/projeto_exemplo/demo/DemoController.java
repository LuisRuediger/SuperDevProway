package com.projeto_exemplo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value = "/inicio")
public class DemoController {

    @Autowired
    PacienteService pacienteService;


    @GetMapping
    public String welcome() {
        return "Hello World! Welcome to my app!";
    }

    @GetMapping(value = "/setor")
    public int obterCodigoSetor() {
        return 7;
    }

    @GetMapping(value = "/paciente")
    public String obterDadosPaciente() {

        return pacienteService.obterDadosPaciente();
    }
}
