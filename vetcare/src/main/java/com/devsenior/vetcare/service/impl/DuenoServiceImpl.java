package com.devsenior.vetcare.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devsenior.vetcare.model.Dueno;
import com.devsenior.vetcare.repository.DuenoRepository;
import com.devsenior.vetcare.service.DuenoService;

@Service
public class DuenoServiceImpl implements DuenoService {

    private final DuenoRepository duenoRepository;

    // Inyección por constructor (buena práctica)
    public DuenoServiceImpl(DuenoRepository duenoRepository) {
        this.duenoRepository = duenoRepository;
    }

    @Override
    public List<Dueno> listarTodos() {
        return duenoRepository.findAll();
    }
}
