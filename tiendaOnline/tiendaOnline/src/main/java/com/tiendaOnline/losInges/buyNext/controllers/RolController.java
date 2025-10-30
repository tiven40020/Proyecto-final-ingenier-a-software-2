package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.entities.Rol;
import com.tiendaOnline.losInges.buyNext.services.RolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class RolController {
    private RolService rolService;

    @GetMapping
    public List<Rol> listar() {
        return rolService.getAll();
    }

    @PostMapping
    public Rol crear(@RequestBody Rol rol) {
        return rolService.create(rol);
    }
}
