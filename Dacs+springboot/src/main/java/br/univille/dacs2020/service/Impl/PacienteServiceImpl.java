package br.univille.dacs2020.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.univille.dacs2020.model.Paciente;
import br.univille.dacs2020.repository.PacienteRepository;
import br.univille.dacs2020.service.PacienteService;

public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private PacienteRepository repository;

    @Override
    public void save(Paciente paciente) {
         repository.save(paciente);

    }

    @Override
    public List<Paciente> getAll() {
        return repository.findAll();
     
    }

    @Override
    public void delete(Paciente paciente) {
          repository.delete(paciente);

    }
    
}