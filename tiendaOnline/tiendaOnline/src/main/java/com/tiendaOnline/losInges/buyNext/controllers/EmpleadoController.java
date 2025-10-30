package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.entities.Empleado;
import com.tiendaOnline.losInges.buyNext.services.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class EmpleadoController {
    private EmpleadoService empleadoService;

    @GetMapping
    public List<Empleado> listar() {
        return empleadoService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Empleado> obtener(@PathVariable Long id) {
        return empleadoService.getById(id);
    }

    @PostMapping
    public Empleado crear(@RequestBody Empleado empleado) {
        return empleadoService.create(empleado);
    }

    @PutMapping("/{id}")
    public Optional<Empleado> actualizar(@PathVariable Long id, @RequestBody Empleado empleado) {
        return empleadoService.update(id, empleado);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        empleadoService.deleteById(id);
    }
}
