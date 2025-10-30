package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.entities.Estado;
import com.tiendaOnline.losInges.buyNext.services.EstadoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EstadoController {
    private EstadoService estadoService;

    @GetMapping
    public List<Estado> listar() {
        return estadoService.getAll();
    }

    @PostMapping
    public Estado crear(@RequestBody Estado estado) {
        return estadoService.create(estado);
    }
}
