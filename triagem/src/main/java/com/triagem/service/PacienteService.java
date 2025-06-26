package com.triagem.service;

import com.triagem.model.Paciente;
import com.triagem.repository.PacienteRepository;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    private final PacienteRepository repository;

    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }
}