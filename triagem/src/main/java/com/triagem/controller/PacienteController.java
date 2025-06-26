package com.triagem.controller;

import com.triagem.model.Paciente;
import com.triagem.service.PacienteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    private final PacienteService service;

    public PacienteController(PacienteService service) {
        this.service = service;
    }

    @PostMapping("/triagem")
    public Paciente cadastrar(@RequestBody Paciente paciente) {
        return service.salvar(paciente);
    }
}