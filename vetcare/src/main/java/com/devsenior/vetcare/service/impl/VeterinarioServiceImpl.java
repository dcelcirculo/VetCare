package com.devsenior.vetcare.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsenior.vetcare.model.Veterinario;
import com.devsenior.vetcare.repository.VeterinarioRepository;
import com.devsenior.vetcare.service.VeterinarioService;

@Service
public class VeterinarioServiceImpl implements VeterinarioService {

    private final VeterinarioRepository veterinarioRepository;

    public VeterinarioServiceImpl(VeterinarioRepository veterinarioRepository) {
        this.veterinarioRepository = veterinarioRepository;
    }

    @Override
    public List<Veterinario> listarTodos() {
        return veterinarioRepository.findAll();
    }
}
