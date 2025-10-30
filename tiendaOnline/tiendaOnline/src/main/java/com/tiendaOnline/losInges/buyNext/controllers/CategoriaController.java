package com.tiendaOnline.losInges.buyNext.controllers;

import com.tiendaOnline.losInges.buyNext.entities.Categoria;
import com.tiendaOnline.losInges.buyNext.services.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class CategoriaController {
    private CategoriaService categoriaService;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Categoria> obtenerPorId(@PathVariable Long id) {
        return categoriaService.getById(id);
    }

    @PostMapping
    public Categoria crear(@RequestBody Categoria categoria) {
        return categoriaService.create(categoria);
    }

    @PutMapping("/{id}")
    public Optional<Categoria> actualizar(@PathVariable Long id, @RequestBody Categoria categoria) {
        return categoriaService.update(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }
}
