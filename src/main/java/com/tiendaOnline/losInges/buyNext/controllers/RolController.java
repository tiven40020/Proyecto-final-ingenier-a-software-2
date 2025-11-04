package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.entities.Rol;
import com.tiendaOnline.losInges.buyNext.services.RolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/roles")
public class RolController {

    private final RolService rolService;

    public RolController(RolService rolService){
        this.rolService = rolService;
    }

    @GetMapping
    public List<Rol> getAll() {
        return rolService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Rol> obtenerPorId(@PathVariable Long id) {
        return rolService.getById(id);
    }

    @PostMapping
    public Rol crear(@RequestBody Rol rol) {
        return rolService.create(rol);
    }

    @PutMapping("/{id}")
    public Optional<Rol> actualizar(@PathVariable Long id, @RequestBody Rol rol) {
        return rolService.update(id, rol);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        rolService.deleteById(id);
    }
}
