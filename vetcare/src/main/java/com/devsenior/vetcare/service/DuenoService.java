package com.devsenior.vetcare.service;

import java.util.List;

import com.devsenior.vetcare.dto.DuenoRequest;
import com.devsenior.vetcare.dto.DuenoResponse;

public interface DuenoService {
    List<DuenoResponse> listarTodos();
    DuenoResponse buscarPorId(Long id);
    DuenoResponse crear(DuenoRequest request);
    DuenoResponse actualizar(Long id, DuenoRequest request);
    void eliminar(Long id);
}